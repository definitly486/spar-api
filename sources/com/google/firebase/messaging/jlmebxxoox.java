package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
final class jlmebxxoox {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final Pattern f24435wkgbmnqykc = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f24436iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f24437ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f24438zoijcleaow;

    private jlmebxxoox(String str, String str2) {
        this.f24436iobyxmoadg = wkgbmnqykc(str2, str);
        this.f24438zoijcleaow = str;
        this.f24437ppxfxbqfkf = str + "!" + str2;
    }

    static jlmebxxoox iobyxmoadg(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new jlmebxxoox(strArrSplit[0], strArrSplit[1]);
    }

    private static String wkgbmnqykc(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f24435wkgbmnqykc.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public String eablkybsjg() {
        return this.f24437ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof jlmebxxoox)) {
            return false;
        }
        jlmebxxoox jlmebxxooxVar = (jlmebxxoox) obj;
        return this.f24436iobyxmoadg.equals(jlmebxxooxVar.f24436iobyxmoadg) && this.f24438zoijcleaow.equals(jlmebxxooxVar.f24438zoijcleaow);
    }

    public int hashCode() {
        return Objects.hashCode(this.f24438zoijcleaow, this.f24436iobyxmoadg);
    }

    public String ppxfxbqfkf() {
        return this.f24436iobyxmoadg;
    }

    public String zoijcleaow() {
        return this.f24438zoijcleaow;
    }
}
