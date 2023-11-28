package mvc_example;

public class MockClientView {
    private controller contactController;

    public static void main(String[] args){

        MockClientView mockClient = new MockClientView();

        mockClient.contactController= new controller();

        mockClient.addAContact("101","Jim","Weiser");
        mockClient.addAContact("102","Tom","Sander");

        mockClient.displayFirstLast("101");
        mockClient.displayFirstLast("102");
    }



        void displayFirstLast (String id){
            String myContact = contactController.findAContact(id);
            System.out.println(myContact);
        }
        void addAContact(String id, String first_name, String last_name){
            contactController.addAContact(id, first_name, last_name);
        }

}
