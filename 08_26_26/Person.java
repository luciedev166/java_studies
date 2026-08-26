// Person.java
//
// Abstract superclass. Cannot be instantiated directly (new Person() is
// illegal) -- it exists purely so Student (and HonorStudent) have common
// fields and behavior to inherit, override, and call via super.
public abstract class Person {

    protected String name;
    protected int id;

    // ----------------- Constructor Overloading (3 versions) -----------------

    // Person() // expects: nothing
    // outputs: a Person with placeholder values (name = "Unknown", id = 0)
    public Person() {
        this("Unknown", 0);
        // TODO: set this.name = "Unknown" and this.id = 0
    }

    // Person(String name) // expects: a name
    // outputs: a Person with that name, id defaults to 0
    public Person(String name) {
        this(name, 0);
        // TODO: implement. Consider calling this() first (this();), then
        // overwriting name -- that's constructor chaining with "this".
    }

    // Person(String name, int id) // expects: a name AND an id
    // outputs: a fully-specified Person
    public Person(String name, int id) {
        this.id = id;
        this.name = name;
        // TODO: implement. Use "this.name" / "this.id" on the left side so
        // the compiler knows you mean the FIELD, not the parameter.
    }

    // ----------------------- Getters / Setters -----------------------

        // getName() // expects: nothing // outputs: this person's name
        public String getName() {
            // TODO: implement
            return this.name;
        }

    // setName(String name) // expects: a new name // outputs: nothing, updates the field
    public void setName(String name) {
        // TODO: implement (use "this.name = name;")
        this.name = name;
    }

    // getId() // expects: nothing // outputs: this person's id
    public int getId() {
        // TODO: implement
        return this.id;
    }

    // setId(int id) // expects: a new id // outputs: nothing, updates the field
    public void setId(int id) {
        // TODO: implement
        this.id = id;
    }

    // --------------------- equalsIgnoreCase practice ---------------------

    // matchesName(String other) // expects: a name string to compare against
    // outputs: true if it matches this.name IGNORING CASE, false otherwise
    // Hint: use the String method .equalsIgnoreCase()
    public boolean matchesName(String other) {
        // TODO: implement
        return this.name.equalsIgnoreCase(other);
    }

    // ------------------- MUST be overridden by every subclass -------------------

    // displayInfo() // expects: nothing
    // outputs: prints info about this person (exact format defined by each subclass)
    public abstract void displayInfo(); //okie so usage of abstract nice

    // ------------- Overridden from Object; subclasses override this FURTHER -------------

    // toString() // expects: nothing
    // outputs: EXACT format -> "Name: " + name + ", ID: " + id
    @Override
    public String toString() {

        // TODO: implement
        return "Name: " + name + ", ID: " + id;
    }
}