package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* JADX INFO: loaded from: classes2.dex */
public final class wflxmlrfwp {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f24900eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f24901gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f24902iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final String f24903lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f24904ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f24905wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f24906zoijcleaow;

    private wflxmlrfwp(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f24906zoijcleaow = str;
        this.f24902iobyxmoadg = str2;
        this.f24904ppxfxbqfkf = str3;
        this.f24905wkgbmnqykc = str4;
        this.f24900eablkybsjg = str5;
        this.f24901gxszxtbevo = str6;
        this.f24903lqeggnwhkg = str7;
    }

    public static wflxmlrfwp iobyxmoadg(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new wflxmlrfwp(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public String eablkybsjg() {
        return this.f24903lqeggnwhkg;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wflxmlrfwp)) {
            return false;
        }
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
        return Objects.equal(this.f24906zoijcleaow, wflxmlrfwpVar.f24906zoijcleaow) && Objects.equal(this.f24902iobyxmoadg, wflxmlrfwpVar.f24902iobyxmoadg) && Objects.equal(this.f24904ppxfxbqfkf, wflxmlrfwpVar.f24904ppxfxbqfkf) && Objects.equal(this.f24905wkgbmnqykc, wflxmlrfwpVar.f24905wkgbmnqykc) && Objects.equal(this.f24900eablkybsjg, wflxmlrfwpVar.f24900eablkybsjg) && Objects.equal(this.f24901gxszxtbevo, wflxmlrfwpVar.f24901gxszxtbevo) && Objects.equal(this.f24903lqeggnwhkg, wflxmlrfwpVar.f24903lqeggnwhkg);
    }

    public int hashCode() {
        return Objects.hashCode(this.f24906zoijcleaow, this.f24902iobyxmoadg, this.f24904ppxfxbqfkf, this.f24905wkgbmnqykc, this.f24900eablkybsjg, this.f24901gxszxtbevo, this.f24903lqeggnwhkg);
    }

    public String ppxfxbqfkf() {
        return this.f24906zoijcleaow;
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f24906zoijcleaow).add("apiKey", this.f24902iobyxmoadg).add("databaseUrl", this.f24904ppxfxbqfkf).add("gcmSenderId", this.f24900eablkybsjg).add("storageBucket", this.f24901gxszxtbevo).add("projectId", this.f24903lqeggnwhkg).toString();
    }

    public String wkgbmnqykc() {
        return this.f24900eablkybsjg;
    }

    public String zoijcleaow() {
        return this.f24902iobyxmoadg;
    }
}
