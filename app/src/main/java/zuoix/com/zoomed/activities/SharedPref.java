package zuoix.com.zoomed.activities;

import android.content.Context;
import android.content.SharedPreferences;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import zuoix.com.zoomed.models.Car;

public class SharedPref {
    private static final String FIRST_NAME = "first name";
    private static final String LAST_NAME = "last name";
    private static final String PHONE_NUMBER = "phone number";
    private static final String EMAIL = "email";
    private static final String CARS = "cars";
    public static final String CAR_MATRICULE = "car matricule";
    public static final String CAR_MODEL = "car model";
    Context context;
    SharedPreferences sp;
    SharedPreferences.Editor editor;

    public SharedPref(Context context) {
        this.context = context;
        sp = context.getSharedPreferences("pref", 0);
        editor = sp.edit();
    }

    public void setGeneration(int generation) {
        editor.putInt("generation", generation);
        editor.commit();
    }

    public int getGeneration() {
        return sp.getInt("generation", 1);
    }

    public void setUserInformation(JSONObject response) throws JSONException {
        String firstName;
        String lastName;
        String email;
        String password;
        String destPhoneNumb;

        // get the user's first name and set in shared prefs: optional
        firstName = response.optString(FIRST_NAME);
        editor.putString(FIRST_NAME, firstName);
        // get the user's last name and set in shared prefs: optional
        lastName = response.optString(LAST_NAME);
        editor.putString(LAST_NAME, lastName);
        // get the user's phone number and set in shared prefs: mandatory so the use of getString instead of optString
        destPhoneNumb = response.getString(PHONE_NUMBER);
        editor.putString(PHONE_NUMBER, destPhoneNumb);
        // get the email and set in shared prefs
        email = response.optString(EMAIL);
        editor.putString(EMAIL, email);
        // get the cars json array convert to string and set in shared pref: again it is mandatory hence the use of get.. inst or opt..
        JSONArray cars = response.getJSONArray(CARS);
        editor.putString(CARS, cars.toString());

    }

    public String getUserFirstName() {
        return sp.getString(FIRST_NAME, "");
    }

    public String getUsersLastName() {
        return sp.getString(LAST_NAME, "");
    }

    public String getDestPhoneNumber() {
        return sp.getString(PHONE_NUMBER, "");
    }

    public String getEmail() {
        return sp.getString(EMAIL, "");
    }

    public List<Car> getCars() {

        List<Car> cars = new ArrayList<>();

        String carsJsonArrayString = sp.getString(CARS, "");

        try {

            JSONArray carsJson = new JSONArray(carsJsonArrayString);

            for (int i = 0; i < carsJson.length(); i++) {

                JSONObject carJson = carsJson.getJSONObject(i);

                cars.add(new Car(carJson.optString(CAR_MATRICULE)
                        , carJson.optString(CAR_MODEL)));
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }


        return cars;
    }


}
