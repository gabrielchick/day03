

public interface Damagable {
    // No implementation. no body { }
    public void damage(int damage);
    public int getDamage();
    
}


//We can say 'what' to do, but not how to do it, so Main java will allow us to create the 'how' to do
//Interface is a 'contract' that allows a class to use it, but it does not function as a standalone concept
//Guarantees certain attributes are present, subclassing allows us to inherit from parent class
//Think thru again and read up more