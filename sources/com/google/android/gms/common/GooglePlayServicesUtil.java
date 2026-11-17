package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.zag;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes2.dex */
public final class GooglePlayServicesUtil extends GooglePlayServicesUtilLight {
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";

    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @Deprecated
    public static Dialog getErrorDialog(int i13, Activity activity, int i14) {
        return getErrorDialog(i13, activity, i14, null);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i13, Context context, int i14) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i13, i14);
    }

    @Deprecated
    public static String getErrorString(int i13) {
        return GooglePlayServicesUtilLight.getErrorString(i13);
    }

    public static Context getRemoteContext(Context context) {
        return GooglePlayServicesUtilLight.getRemoteContext(context);
    }

    public static Resources getRemoteResource(Context context) {
        return GooglePlayServicesUtilLight.getRemoteResource(context);
    }

    @ResultIgnorabilityUnspecified
    @HideFirstParty
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i13) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(i13);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static boolean showErrorDialogFragment(int i13, Activity activity, int i14) {
        return showErrorDialogFragment(i13, activity, i14, null);
    }

    @Deprecated
    public static void showErrorNotification(int i13, Context context) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i13) || GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i13)) {
            googleApiAvailability.zaf(context);
        } else {
            googleApiAvailability.showErrorNotification(context, i13);
        }
    }

    @Deprecated
    public static Dialog getErrorDialog(int i13, Activity activity, int i14, DialogInterface.OnCancelListener onCancelListener) {
        if (true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i13)) {
            i13 = 18;
        }
        return GoogleApiAvailability.getInstance().getErrorDialog(activity, i13, i14, onCancelListener);
    }

    @KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context, int i13) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i13);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static boolean showErrorDialogFragment(int i13, Activity activity, int i14, DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i13, activity, null, i14, onCancelListener);
    }

    @ResultIgnorabilityUnspecified
    public static boolean showErrorDialogFragment(int i13, Activity activity, Fragment fragment, int i14, DialogInterface.OnCancelListener onCancelListener) {
        if (true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i13)) {
            i13 = 18;
        }
        int i15 = i13;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (fragment == null) {
            return googleApiAvailability.showErrorDialogFragment(activity, i15, i14, onCancelListener);
        }
        Dialog dialogZaa = googleApiAvailability.zaa(activity, i15, zag.zac(fragment, GoogleApiAvailability.getInstance().getErrorResolutionIntent(activity, i15, "d"), i14), onCancelListener, null);
        if (dialogZaa == null) {
            return false;
        }
        googleApiAvailability.zad(activity, dialogZaa, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }
}
