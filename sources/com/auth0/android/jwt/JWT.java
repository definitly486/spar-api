package com.auth0.android.jwt;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class JWT implements Parcelable {
    public static final Parcelable.Creator<JWT> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private String f20571iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private wkgbmnqykc f20572jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Map f20573yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f20574zdlpuopuiu;

    static class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public JWT createFromParcel(Parcel parcel) {
            return new JWT(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public JWT[] newArray(int i13) {
            return new JWT[i13];
        }
    }

    class zoijcleaow extends be.iobyxmoadg<Map<String, String>> {
        zoijcleaow() {
        }
    }

    public JWT(String str) {
        ppxfxbqfkf(str);
        this.f20574zdlpuopuiu = str;
    }

    static Gson gxszxtbevo() {
        return new com.google.gson.wkgbmnqykc().wkgbmnqykc(wkgbmnqykc.class, new JWTDeserializer()).zoijcleaow();
    }

    private Object lqeggnwhkg(String str, Type type) {
        try {
            return gxszxtbevo().draadjrbmk(str, type);
        } catch (Exception e13) {
            throw new DecodeException("The token's payload had an invalid JSON format.", e13);
        }
    }

    private String[] nufgyqmvbu(String str) {
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length == 2 && str.endsWith(".")) {
            strArrSplit = new String[]{strArrSplit[0], strArrSplit[1], ""};
        }
        if (strArrSplit.length == 3) {
            return strArrSplit;
        }
        throw new DecodeException(String.format("The token was expected to have 3 parts, but got %s.", Integer.valueOf(strArrSplit.length)));
    }

    private void ppxfxbqfkf(String str) {
        String[] strArrNufgyqmvbu = nufgyqmvbu(str);
        this.f20573yggfygwlhe = (Map) lqeggnwhkg(zoijcleaow(strArrNufgyqmvbu[0]), new zoijcleaow().wkgbmnqykc());
        this.f20572jyumaefscl = (wkgbmnqykc) lqeggnwhkg(zoijcleaow(strArrNufgyqmvbu[1]), wkgbmnqykc.class);
        this.f20571iwizpuwonk = strArrNufgyqmvbu[2];
    }

    private String zoijcleaow(String str) {
        try {
            return new String(Base64.decode(str, 11), Charset.defaultCharset());
        } catch (IllegalArgumentException e13) {
            throw new DecodeException("Received bytes didn't correspond to a valid Base64 encoded string.", e13);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public com.auth0.android.jwt.zoijcleaow eablkybsjg(String str) {
        return this.f20572jyumaefscl.iobyxmoadg(str);
    }

    public String toString() {
        return this.f20574zdlpuopuiu;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f20574zdlpuopuiu);
    }
}
