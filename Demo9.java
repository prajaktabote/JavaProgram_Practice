class Demo9{
    public static void main(String args[]){
        ArrayList al=new ArrayList();
        al.ass(new Employee("Rahul",25));
        al.add(new Emplyee("Ashish",15));
        al.add(new Employee("kahana",22));
        Collections.sort(al,(obj1,obj2))->;
           

        System.out.println(al);
    }
}