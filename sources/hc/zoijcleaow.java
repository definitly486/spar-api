package hc;

import ac.dsvhmnatus;
import ac.zynmafqrjb;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import dc.iozdgvuglv;
import ec.btonecajqb;
import java.nio.charset.Charset;
import o9.nufgyqmvbu;
import q9.yggfygwlhe;

/* JADX INFO: loaded from: classes2.dex */
public class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final eablkybsjg f40043iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final nufgyqmvbu f40044zoijcleaow;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final btonecajqb f40041ppxfxbqfkf = new btonecajqb();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final String f40042wkgbmnqykc = eablkybsjg("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final String f40039eablkybsjg = eablkybsjg("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final nufgyqmvbu f40040gxszxtbevo = new nufgyqmvbu() { // from class: hc.iobyxmoadg
        @Override // o9.nufgyqmvbu
        public final Object apply(Object obj) {
            return zoijcleaow.wkgbmnqykc((iozdgvuglv) obj);
        }
    };

    zoijcleaow(eablkybsjg eablkybsjgVar, nufgyqmvbu nufgyqmvbuVar) {
        this.f40043iobyxmoadg = eablkybsjgVar;
        this.f40044zoijcleaow = nufgyqmvbuVar;
    }

    private static String eablkybsjg(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb3 = new StringBuilder(str.length() + str2.length());
        for (int i13 = 0; i13 < str.length(); i13++) {
            sb3.append(str.charAt(i13));
            if (str2.length() > i13) {
                sb3.append(str2.charAt(i13));
            }
        }
        return sb3.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] wkgbmnqykc(iozdgvuglv iozdgvuglvVar) {
        return f40041ppxfxbqfkf.hkdspvbjdz(iozdgvuglvVar).getBytes(Charset.forName("UTF-8"));
    }

    public static zoijcleaow zoijcleaow(Context context, ic.btonecajqb btonecajqbVar, dsvhmnatus dsvhmnatusVar) {
        yggfygwlhe.gxszxtbevo(context);
        o9.btonecajqb btonecajqbVarLqeggnwhkg = yggfygwlhe.ppxfxbqfkf().lqeggnwhkg(new com.google.android.datatransport.cct.iobyxmoadg(f40042wkgbmnqykc, f40039eablkybsjg));
        o9.ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = o9.ppxfxbqfkf.zoijcleaow("json");
        nufgyqmvbu nufgyqmvbuVar = f40040gxszxtbevo;
        return new zoijcleaow(new eablkybsjg(btonecajqbVarLqeggnwhkg.iobyxmoadg("FIREBASE_CRASHLYTICS_REPORT", iozdgvuglv.class, ppxfxbqfkfVarZoijcleaow, nufgyqmvbuVar), btonecajqbVar.zoijcleaow(), dsvhmnatusVar), nufgyqmvbuVar);
    }

    public Task ppxfxbqfkf(zynmafqrjb zynmafqrjbVar, boolean z13) {
        return this.f40043iobyxmoadg.dxjokdxxww(zynmafqrjbVar, z13).getTask();
    }
}
