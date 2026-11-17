package rr0;

import a8.eablkybsjg;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.pkzmftpjix;
import gg.cqumvgiudr;
import kotlin.jvm.internal.zdlpuopuiu;
import q1.ppxfxbqfkf;
import q5.gxszxtbevo;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final pkzmftpjix f83684iobyxmoadg;

    public zoijcleaow(pkzmftpjix savedStateHandle) {
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f83684iobyxmoadg = savedStateHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle wkgbmnqykc(String str, draadjrbmk draadjrbmkVar, eablkybsjg eablkybsjgVar) {
        return ppxfxbqfkf.zoijcleaow(cqumvgiudr.iobyxmoadg(str, draadjrbmkVar.invoke(eablkybsjgVar)));
    }

    public void eablkybsjg(String key) {
        zdlpuopuiu.btonecajqb(key, "key");
        this.f83684iobyxmoadg.iobyxmoadg(key);
    }

    public void ppxfxbqfkf(final eablkybsjg store, final String key, final draadjrbmk stateProvider) {
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(key, "key");
        zdlpuopuiu.btonecajqb(stateProvider, "stateProvider");
        this.f83684iobyxmoadg.eablkybsjg(key, new gxszxtbevo.zoijcleaow() { // from class: rr0.iobyxmoadg
            @Override // q5.gxszxtbevo.zoijcleaow
            public final Bundle iobyxmoadg() {
                return zoijcleaow.wkgbmnqykc(key, stateProvider, store);
            }
        });
    }

    public Parcelable zoijcleaow(String key) {
        zdlpuopuiu.btonecajqb(key, "key");
        Bundle bundle = (Bundle) this.f83684iobyxmoadg.zoijcleaow(key);
        if (bundle != null) {
            return bundle.getParcelable(key);
        }
        return null;
    }
}
