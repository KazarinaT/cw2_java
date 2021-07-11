import java.util.Arrays;

public class Country {
    protected String country;
    protected String continent;
    protected Float population;
    protected Number countryCode;
    protected String capital;
    protected String [] cityName = new String[1];

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getContinent() {
        return continent;
    }
    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Float getPopulation() {
        return population;
    }
    public void setPopulation(Float population) {
        this.population = population;
    }

    public Number getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(Number countryCode) {
        this.countryCode = countryCode;
    }


    public String getCapital() {
        return capital;
    }
    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String[] getCityName() {
        return cityName;
    }
    public void setCityName(String[] cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "Страна = '" + country + '\'' +
                ", Континент = '" + continent + '\'' +
                ", Насиление = " + population +
                ", Телефонный код страны = " + countryCode +
                ", Столица = '" + capital + '\'' +
                ", Города страны = " + Arrays.toString(cityName) +
                '}';
    }
}
