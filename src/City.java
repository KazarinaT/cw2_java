public class City {
    protected String name;
    protected String region;
    protected String country;
    protected Float population;
    protected Number postcode;
    protected Number phoneCode;

    @Override
    public String toString() {
        return "City{" +
                "Город = '" + name + '\'' +
                ", Регион = '" + region + '\'' +
                ", Страна = '" + country + '\'' +
                ", Население города = " + population +
                ", Почтовый код города = " + postcode +
                ", Телефонный код = " + phoneCode +
                '}';
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }


    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }


    public Float getPopulation() {
        return population;
    }
    public void setPopulation(Float population) {
        this.population = population;
    }


    public Number getPostcode() {
        return postcode;
    }
    public void setPostcode(Number postcode) {
        this.postcode = postcode;
    }


    public Number getPhoneCode() {
        return phoneCode;
    }
    public void setPhoneCode(Number phoneCode) {
        this.phoneCode = phoneCode;
    }
}
