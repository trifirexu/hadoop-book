package crunch;

public class WeatherRecord {
  private int year;
  private int temperature;
  private String stationId;

  public WeatherRecord() {
  }

  public WeatherRecord(int year, int temperature, String stationId) {
    this.year = year;
    this.temperature = temperature;
    this.stationId = stationId;
  }

  // getters elided
}
