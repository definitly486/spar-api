package bz;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class kcexrzcfyt extends metgxyhuhe implements e, t6.stevsuqkhv {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17502eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final t6.zdlpuopuiu f17503gxszxtbevo;

    class iobyxmoadg extends e.iobyxmoadg {
        iobyxmoadg(kc2.gxszxtbevo gxszxtbevoVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (kcexrzcfyt.this.ppxfxbqfkf() != null) {
                return;
            }
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(kcexrzcfyt.this.f17502eablkybsjg);
                if (advertisingIdInfo != null) {
                    kcexrzcfyt.this.btonecajqb(advertisingIdInfo.getId());
                }
            } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
            }
        }
    }

    kcexrzcfyt(Context context, t6.zdlpuopuiu zdlpuopuiuVar) {
        super(kc2.lqeggnwhkg.AdvertiserId);
        this.f17502eablkybsjg = context;
        this.f17503gxszxtbevo = zdlpuopuiuVar;
    }

    @Override // bz.e
    public e.iobyxmoadg agtfadlqog(kc2.gxszxtbevo gxszxtbevoVar) {
        return new iobyxmoadg(gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() throws jrbgnlbqoe, u4 {
        String str = (String) ppxfxbqfkf();
        if (str != null && !str.equals(CommonUrlParts.Values.FALSE_INTEGER)) {
            return str;
        }
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.f17502eablkybsjg) != 0) {
            throw new u4(t6.iwizpuwonk.iobyxmoadg(new byte[]{38, -73, 58, 110, -1, -19, 27, -8, -76, 77, -32, 56, -3, -11, -80, -96, 108, -91, -126, 29, 100, 23, 30, 54, 56, 14, -21, -11, 115, 7, 5, -34, 53, 37, 18, -14, -28, 103, 58, -53, 81, 122, -81, 1, -39, 117, -122, -7, 30, 105, -55, -50, 99, -31, 32, 89, 3, -102, -95, 95, 75, 80, -75, -51, -128, 107, 87, -10, 101, -118, -22, 73, -28, -31, -22, 21, -70, 104, -10, -101}));
        }
        ojitshcjhn(null);
        throw new jrbgnlbqoe(t6.iwizpuwonk.iobyxmoadg(new byte[]{-103, -75, 14, 84, 69, -13, 108, -7, -111, 8, -91, -65, 8, 77, 23, 37, -119, -24, -98, -123, -58, 2, 22, -11, -46, -113, -60, -89, 96, 60, 110, -110}));
    }

    @Override // t6.stevsuqkhv
    public Set eablkybsjg() {
        return t6.jyumaefscl.iobyxmoadg(t6.iwizpuwonk.iobyxmoadg(new byte[]{-66, -105, -31, -70, -121, -70, -92, 42, -39, -51, -116, -12, 3, -19, 77, -7, 41, -110, -114, 116, 44, 103, -43, 28, -1, 112, 110, -98, 1, 33, -92, -4, 108, -93, 2, 47, -11, -128, -35, 116, 69, -7, 36, 126, -108, 3, 123, -96, -62, -95, 40, 14, 29, 44, 125, -20, -98, -8, -1, 57, 64, -1, 59, -6}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-66, -105, -31, -70, -121, -70, -92, 42, -39, -51, -116, -12, 3, -19, 77, -7, -126, 17, 104, -15, -21, 6, 100, 13, 25, 20, -74, 91, -4, -67, 80, 0, -24, -118, -20, -83, -19, 6, 60, -47, 30, -51, 86, 103, 95, -11, -126, 105, -66, 73, 123, -77, -108, 62, 16, -19, 52, -27, 118, -31, 1, 41, 85, -48}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-66, -105, -31, -70, -121, -70, -92, 42, -39, -51, -116, -12, 3, -19, 77, -7, -51, 118, 17, 73, -42, -74, -114, -94, 58, -67, -5, -127, -96, -127, -86, 24, 10, -121, 12, 15, 48, -126, -122, -28, -109, -61, -45, -43, -15, 96, -23, -85}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-66, -105, -31, -70, -121, -70, -92, 42, -39, -51, -116, -12, 3, -19, 77, -7, 41, -110, -114, 116, 44, 103, -43, 28, -1, 112, 110, -98, 1, 33, -92, -4, -56, 68, -75, -124, -70, 77, -17, -75, -35, -17, 127, 15, 117, -39, 36, 125, 8, -15, 11, 22, -62, -107, 5, 102, 98, 8, 96, 1, 63, -15, -65, -88, -73, 21, 63, 57, 104, 103, 45, -112, 3, 91, 126, -42, -122, 112, 77, -89}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-66, -105, -31, -70, -121, -70, -92, 42, -39, -51, -116, -12, 3, -19, 77, -7, 41, -110, -114, 116, 44, 103, -43, 28, -1, 112, 110, -98, 1, 33, -92, -4, -56, 68, -75, -124, -70, 77, -17, -75, -35, -17, 127, 15, 117, -39, 36, 125, -1, -95, -36, -93, 41, -23, -86, -105, 102, 52, -86, 91, -70, 72, -75, -122, -52, -53, 67, 80, -70, -66, -68, -106, 104, 122, -1, -92, 104, 111, 56, 113}));
    }

    @Override // t6.agtfadlqog
    public t6.zdlpuopuiu jyumaefscl() {
        return this.f17503gxszxtbevo;
    }
}
