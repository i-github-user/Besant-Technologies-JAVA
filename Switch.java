public class Switch {

    public static void main(String[] args) {
        String status="shipping";
        switch(status){
            case "delivered": System.out.println("order is delivered"); break;
            default: System.out.println("this is default");
            case "shipping" : System.out.println("order shipping" );
            case "warehouse": System.out.println("item in warehouse");


        }
    }
}
