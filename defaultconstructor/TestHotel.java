class TestHotel{

public static void main(String []a){


Hotel ho=new Hotel();
int noOfHotel=ho.noOfHotel;
ho.noOfHotel=5;
System.out.println(ho.noOfHotel);


byte noOfRooms=ho.noOfRooms;
ho.noOfRooms=50;
System.out.println(ho.noOfRooms);


int noOfStaffs=ho.noOfStaffs;
ho.noOfStaffs=100;
System.out.println(ho.noOfStaffs);


}

}