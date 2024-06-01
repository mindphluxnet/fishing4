package fishing4.game;

import java.text.DecimalFormat;

import fishing4.a.AESUtils;

public final class globalConfig {
   public static final int languageId = fishing4.game.k.getLanguageId();
   public static String userName = new String();
   public static boolean isConnected = false;
   public static boolean d = false; // set to true in onClick handler of possibly an agreement view?
   public static boolean e = false; // seems to be unused
   public static boolean f; // used once in an extremely complicated switch statement?
   public static AESUtils g = AESUtils.createInstance();
   public static AESUtils h = AESUtils.createInstance();
   public static String i = new String(); // is being set to random Korean strings and only read twice. Maybe ProBuilder having a laugh?
   public static boolean j = true;
   public static int k = 73; // can be 73 or 61. Seems to have something to do with screen resolution.
   public static boolean l = true; // seems to be used to switch states for some graphics routines?
   public static boolean isPlayStore = false; // never set to true but used to check if the Google Play Store is available?
   public static String n; // related to Facebook sharing
   public static boolean o = false; // possibly related to server communication
   public static DecimalFormat p = new DecimalFormat("###0.0#"); // unused
}
