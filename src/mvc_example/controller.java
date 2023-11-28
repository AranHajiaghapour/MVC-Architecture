package mvc_example;

public class controller {
    String findAContact (String id){
        return LocalReposotory.getContact(Long.parseLong(id)).toString();

    }

    void addAContact(String id, String first_name , String last_Name){
        long anId= Long.parseLong(id);
        LocalReposotory.addContact(new Contact(anId,first_name,last_Name));
    }
}
