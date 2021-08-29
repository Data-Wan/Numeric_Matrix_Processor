class Employee {

    // write fields
    String name;

    String email;

    int experience;

    // write constructor

    public Employee(final String name, final String email, final int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    // write getters

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public int getExperience() {
        return this.experience;
    }
}

class Developer extends Employee {

    // write fields
    String mainLanguage;

    String[] skills;
    // write constructor

    public Developer(final String name,
                     final String email,
                     final int experience,
                     final String mainLanguage,
                     final String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = new String[skills.length];
        System.arraycopy(skills, 0, this.skills, 0, skills.length);
    }

    // write getters

    public String getMainLanguage() {
        return this.mainLanguage;
    }

    public String[] getSkills() {
        String[] skills = new String[this.skills.length];
        System.arraycopy(this.skills, 0, skills, 0, this.skills.length);

        return skills;
    }
}

class DataAnalyst extends Employee {

    // write fields
    boolean phd;

    String[] methods;

    // write constructor

    public DataAnalyst(final String name,
                       final String email,
                       final int experience,
                       final boolean phd,
                       final String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = new String[methods.length];
        System.arraycopy(methods, 0, this.methods, 0, methods.length);
    }

    // write getters

    public boolean isPhd() {
        return this.phd;
    }

    public String[] getMethods() {
        String[] methods = new String[this.methods.length];
        System.arraycopy(this.methods, 0, methods, 0, this.methods.length);

        return methods;
    }
}