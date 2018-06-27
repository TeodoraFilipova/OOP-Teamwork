package theblackpanther;

public abstract class event {
    private String name;
    private String date;
    private String startHour;
    private String endHour;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartHour() {
        return startHour;
    }

    public void setStartHour(String startHour) {
        this.startHour = startHour;
    }

    public String getEndHour() {
        return endHour;
    }

    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public event() {
        this("", "", "", "", "")
    }
    public event(String name) {
        this(name, "", "", "", "")
    }
    public event(String name, String date) {
        this(name, date, "", "", "")
    }
    public event(String name, String date, String start_hour) {
        this(name, date, start_hour, "", "")
    }

    public event(String name, String date, String start_hour, String end_hour) {
        this(name, date, start_hour, end_hour, "")
    }

    public event(String name, String date, String startHour, String endHour, String description) {
        setName(name);
        setDate(date);
        setStartHour(startHour);
        setEndHour(endHour);
        setDescription(description);
    }

    public abstract void  display_event();
	public abstract void delete_event();



}