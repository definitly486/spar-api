package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new stevsuqkhv();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private zoijcleaow f24329jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Map f24330yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    Bundle f24331zdlpuopuiu;

    public static class zoijcleaow {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        private final Uri f24332agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private final String f24333btonecajqb;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private final boolean f24334cqumvgiudr;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private final String f24335draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private final String f24336dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final String f24337eablkybsjg;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private final boolean f24338esjtqupxsv;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private final String f24339gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final String[] f24340gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f24341iobyxmoadg;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final boolean f24342iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final boolean f24343jyumaefscl;

        /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
        private final int[] f24344kcexrzcfyt;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private final long[] f24345lereixgezr;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final String f24346lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final String f24347nufgyqmvbu;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        private final String f24348ojitshcjhn;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        private final Integer f24349oxmwwwfdhm;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String[] f24350ppxfxbqfkf;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        private final Integer f24351rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        private final Integer f24352vdvldrhtss;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        private final String f24353wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f24354wkgbmnqykc;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final boolean f24355yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Long f24356zdlpuopuiu;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f24357zoijcleaow;

        private static String[] ppxfxbqfkf(ylkuphrtab ylkuphrtabVar, String str) {
            Object[] objArrLqeggnwhkg = ylkuphrtabVar.lqeggnwhkg(str);
            if (objArrLqeggnwhkg == null) {
                return null;
            }
            String[] strArr = new String[objArrLqeggnwhkg.length];
            for (int i13 = 0; i13 < objArrLqeggnwhkg.length; i13++) {
                strArr[i13] = String.valueOf(objArrLqeggnwhkg[i13]);
            }
            return strArr;
        }

        public String iobyxmoadg() {
            return this.f24354wkgbmnqykc;
        }

        public String wkgbmnqykc() {
            return this.f24341iobyxmoadg;
        }

        public Uri zoijcleaow() {
            String str = this.f24347nufgyqmvbu;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        private zoijcleaow(ylkuphrtab ylkuphrtabVar) {
            this.f24341iobyxmoadg = ylkuphrtabVar.rgvfuqvkyq("gcm.n.title");
            this.f24357zoijcleaow = ylkuphrtabVar.nufgyqmvbu("gcm.n.title");
            this.f24350ppxfxbqfkf = ppxfxbqfkf(ylkuphrtabVar, "gcm.n.title");
            this.f24354wkgbmnqykc = ylkuphrtabVar.rgvfuqvkyq("gcm.n.body");
            this.f24337eablkybsjg = ylkuphrtabVar.nufgyqmvbu("gcm.n.body");
            this.f24340gxszxtbevo = ppxfxbqfkf(ylkuphrtabVar, "gcm.n.body");
            this.f24346lqeggnwhkg = ylkuphrtabVar.rgvfuqvkyq("gcm.n.icon");
            this.f24336dxjokdxxww = ylkuphrtabVar.ojitshcjhn();
            this.f24333btonecajqb = ylkuphrtabVar.rgvfuqvkyq("gcm.n.tag");
            this.f24339gtknphoqwx = ylkuphrtabVar.rgvfuqvkyq("gcm.n.color");
            this.f24335draadjrbmk = ylkuphrtabVar.rgvfuqvkyq("gcm.n.click_action");
            this.f24353wflxmlrfwp = ylkuphrtabVar.rgvfuqvkyq("gcm.n.android_channel_id");
            this.f24332agtfadlqog = ylkuphrtabVar.gxszxtbevo();
            this.f24347nufgyqmvbu = ylkuphrtabVar.rgvfuqvkyq("gcm.n.image");
            this.f24348ojitshcjhn = ylkuphrtabVar.rgvfuqvkyq("gcm.n.ticker");
            this.f24351rgvfuqvkyq = ylkuphrtabVar.zoijcleaow("gcm.n.notification_priority");
            this.f24352vdvldrhtss = ylkuphrtabVar.zoijcleaow("gcm.n.visibility");
            this.f24349oxmwwwfdhm = ylkuphrtabVar.zoijcleaow("gcm.n.notification_count");
            this.f24355yggfygwlhe = ylkuphrtabVar.iobyxmoadg("gcm.n.sticky");
            this.f24343jyumaefscl = ylkuphrtabVar.iobyxmoadg("gcm.n.local_only");
            this.f24342iwizpuwonk = ylkuphrtabVar.iobyxmoadg("gcm.n.default_sound");
            this.f24334cqumvgiudr = ylkuphrtabVar.iobyxmoadg("gcm.n.default_vibrate_timings");
            this.f24338esjtqupxsv = ylkuphrtabVar.iobyxmoadg("gcm.n.default_light_settings");
            this.f24356zdlpuopuiu = ylkuphrtabVar.btonecajqb("gcm.n.event_time");
            this.f24344kcexrzcfyt = ylkuphrtabVar.eablkybsjg();
            this.f24345lereixgezr = ylkuphrtabVar.vdvldrhtss();
        }
    }

    public RemoteMessage(Bundle bundle) {
        this.f24331zdlpuopuiu = bundle;
    }

    public Map getData() {
        if (this.f24330yggfygwlhe == null) {
            this.f24330yggfygwlhe = wkgbmnqykc.iobyxmoadg.iobyxmoadg(this.f24331zdlpuopuiu);
        }
        return this.f24330yggfygwlhe;
    }

    public String getMessageId() {
        String string = this.f24331zdlpuopuiu.getString("google.message_id");
        return string == null ? this.f24331zdlpuopuiu.getString("message_id") : string;
    }

    public zoijcleaow lqeggnwhkg() {
        if (this.f24329jyumaefscl == null && ylkuphrtab.zdlpuopuiu(this.f24331zdlpuopuiu)) {
            this.f24329jyumaefscl = new zoijcleaow(new ylkuphrtab(this.f24331zdlpuopuiu));
        }
        return this.f24329jyumaefscl;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        stevsuqkhv.ppxfxbqfkf(this, parcel, i13);
    }
}
