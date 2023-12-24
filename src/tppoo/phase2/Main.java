package tppoo.phase2;

import tppoo.modules.Departement;
import tppoo.modules.Enseignant;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        String url="jdbc:mysql://localhost:3306/systeme educative";
        String user="root";
        String mdp="";
        try {
            Connection cx = DriverManager.getConnection(url, user, mdp);
            System.out.println("Good Connection");
            //Createtabledepart(cx);
           // CreatetableEns(cx);

         // Inserttableens(new Enseignant("ano","douaa","douaaano@gmail.com","2eme annee",44),cx);
          // Inserttabledepart(new Departement("genie mecanique", new Enseignant("meriem","mali","meriemmali@gmail.com","doct",3), 5),cx);

          // Selectenseignant( cx);
           //  Selectdepart(cx);
           ArrayList<Departement> allDepartments = Selectdepart(cx);


            for (Departement dep : allDepartments) {
                System.out.println("ID : " + dep.getId());
                System.out.println("Nom : " + dep.getNom());
                Enseignant responsable = dep.getResponsable();
                if (responsable != null) {
                    System.out.println("Responsable : " + responsable.getNom());
                } else {
                    System.out.println("Aucun responsable assigné.");
                }
                System.out.println("------------------------------");
            }

            ArrayList<Enseignant> enseignants = Selectenseignant(cx);


            for (Enseignant enseignant : enseignants) {

                System.out.println("Enseignant nom : " + enseignant.getNom());
                System.out.println("prenom : " + enseignant.getPrenom());
                System.out.println("Email : " + enseignant.getEmail());
                System.out.println("Grade : " + enseignant.getGrade());
                System.out.println("Id : " + enseignant.getId());

            }
//updateDepartement(new Departement("jolie",new Enseignant("aniss","ansss","anissanss@gmail.com","lic",3),1),cx);
//updateEnseignant(new Enseignant("chou","chouaib","chouchouuaib@gmail.com","ingenieurie",44),cx);

          // deletedepartement(1,cx);
           deleteEnseignant(1,cx);
        }
         catch (SQLException e) {
            System.out.println("Bad connection");
            e.printStackTrace();
        }
    }

    public static void Createtabledepart(Connection cx) throws SQLException {
        String sql = "create table IF NOT EXISTS Departement\n" +
                "(\n" +
                " id int auto_increment\n" +
                " primary key,\n" +
                " nom varchar(250), \n" +
                 "responsable varchar(250) ,\n" +
                "foreign key (responsable) references Enseignant (nom)\n" +
                ");";

        Statement stmt = cx.createStatement();
        stmt.execute(sql);
        System.out.println("Un nouveau tableau a été créé avec succès!");
    }
    public static void Inserttabledepart(Departement departement, Connection cx) throws SQLException {
        String sql = "INSERT INTO Departement (id,nom,responsable) VALUES (?, ?, ?)";
        PreparedStatement st = cx.prepareStatement(sql);
        st.setInt(1,departement.getId());
        st.setString(2,departement.getNom());
        st.setString(3,departement.getResponsable().getNom());
        int rowsInserted = st.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Un nouveau departement a été inséré avec succès!");
        }

    }


    public static ArrayList<Departement> Selectdepart(Connection cx) throws SQLException {
        String sql = "SELECT * FROM Departement";
        ArrayList<Departement> departements = new ArrayList<>();
        Statement statement = cx.createStatement();
        ResultSet rslt = statement.executeQuery(sql);
        while (rslt.next()) {
            Enseignant ens = new Enseignant(rslt.getString("nom"));

            departements.add(new Departement(rslt.getString("nom"),ens,rslt.getInt("id") ));
        }
        return departements;
    }



    public static void updateDepartement(Departement departement, Connection cx) throws SQLException {
        String sql = "UPDATE Departement SET nom = ?, responsable = ? WHERE id = ?";
        PreparedStatement st = cx.prepareStatement(sql);
        st.setString(1, departement.getNom());
        st.setString(2, departement.getResponsable().getNom());
        st.setInt(3, departement.getId());

        int rowsUpdated = st.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Le département a été mis à jour avec succès!");
        } else {
            System.out.println("Échec de la mise à jour du département.");
        }
    }



     public static void deletedepartement(int id, Connection cx) throws SQLException {
        String query = "DELETE FROM Departement WHERE id = ?";
        PreparedStatement ps = cx.prepareStatement(query);
        ps.setInt(1, id);
        ps.execute();
        System.out.println("delete de Departement de l'id : " + id + " ,est fait avec success.");
    }


   public static void CreatetableEns(Connection cx) throws SQLException {
        String sql = "create table IF NOT EXISTS Enseignant\n" +
                "(\n" +
                " id int auto_increment\n" +
                " primary key,\n" +
                " nom varchar(250), \n" +
                " prenom varchar(250), \n" +
                " email varchar(250), \n" +
                " grade varchar(250)  \n" +
                ");";

        Statement stmt = cx.createStatement();
        stmt.execute(sql);
        System.out.println("Un nouveau tableau a été créé avec succès!");
    }
    public static void Inserttableens(Enseignant enseignant, Connection cx) throws SQLException {
        String sql = "INSERT INTO Enseignant ( nom,  prenom,  email,  grade,  id) VALUES (?,?,?,?,?)";
        PreparedStatement st = cx.prepareStatement(sql);
        st.setString(1,enseignant.getNom());
       st.setString(2, enseignant.getPrenom());
        st.setString(3, enseignant.getEmail());
        st.setString(4, enseignant.getGrade());
        st.setInt(5,enseignant.getId());
        int rowsInserted = st.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Un nouveau enseignant a été inséré avec succès!");
        }

    }


    public static ArrayList<Enseignant> Selectenseignant(Connection cx) throws SQLException {
        String sql = "SELECT * FROM Enseignant";
        ArrayList<Enseignant> enseignants = new ArrayList<>();
        Statement statement = cx.createStatement();
        ResultSet rslt = statement.executeQuery(sql);
        while (rslt.next()) {
            Enseignant enseignant = new Enseignant();
            enseignant.setNom(rslt.getString("nom"));
            enseignant.setPrenom(rslt.getString("prenom"));
            enseignant.setEmail(rslt.getString("email"));
            enseignant.setGrade(rslt.getString("grade"));
            enseignant.setId(rslt.getInt("Id"));
            enseignants.add(enseignant);
        }
        return enseignants;
    }
    public static void updateEnseignant(Enseignant enseignant, Connection cx) throws SQLException {
        String sql = "UPDATE Enseignant SET nom = ?, prenom = ?, email = ?, grade = ? WHERE id = ?";
        PreparedStatement st = cx.prepareStatement(sql);
        st.setString(1, enseignant.getNom());
        st.setString(2, enseignant.getPrenom());
        st.setString(3, enseignant.getEmail());
        st.setString(4, enseignant.getGrade());
        st.setInt(5, enseignant.getId());

        int rowsUpdated = st.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("L'enseignant a été mis à jour avec succès!");
        } else {
            System.out.println("Échec de la mise à jour de l'enseignant.");
        }
    }



    public static void deleteEnseignant(int id, Connection cx) throws SQLException {
        String query = "DELETE FROM Enseignant WHERE Id = ?";
        PreparedStatement ps = cx.prepareStatement(query);
        ps.setInt(1, id);
        ps.execute();
        System.out.println("delete de Enseignant de l'id : " + id + " est fait avec success.");
    }

}
