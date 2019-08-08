package dems.apps.travelmantics;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class FirebaseUtil {
    public static FirebaseDatabase firebaseDatabase;
    public static DatabaseReference databaseReference;
    public static ArrayList<TravelDeal> mDeals;
    private static FirebaseUtil firebaseUtil;

    private FirebaseUtil() {
    }

    public static void openFbReference(String ref) {
        if (firebaseUtil == null) {
            firebaseUtil = new FirebaseUtil();
            firebaseDatabase = FirebaseDatabase.getInstance();
        }
        mDeals = new ArrayList<>();
        databaseReference = firebaseDatabase.getReference().child(ref);
    }
}
