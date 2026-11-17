package a5;

import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Collections;
import java.util.List;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;

/* JADX INFO: loaded from: classes.dex */
public interface jpowsppfya {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final String f555iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final byte[] f556ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f557zoijcleaow;

        public iobyxmoadg(String str, int i13, byte[] bArr) {
            this.f555iobyxmoadg = str;
            this.f557zoijcleaow = i13;
            this.f556ppxfxbqfkf = bArr;
        }
    }

    public interface ppxfxbqfkf {
        SparseArray iobyxmoadg();

        jpowsppfya zoijcleaow(int i13, zoijcleaow zoijcleaowVar);
    }

    public static final class wkgbmnqykc {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private String f558eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f559iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f560ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private int f561wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f562zoijcleaow;

        public wkgbmnqykc(int i13, int i14) {
            this(Integer.MIN_VALUE, i13, i14);
        }

        private void wkgbmnqykc() {
            if (this.f561wkgbmnqykc == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void iobyxmoadg() {
            int i13 = this.f561wkgbmnqykc;
            this.f561wkgbmnqykc = i13 == Integer.MIN_VALUE ? this.f562zoijcleaow : i13 + this.f560ppxfxbqfkf;
            this.f558eablkybsjg = this.f559iobyxmoadg + this.f561wkgbmnqykc;
        }

        public int ppxfxbqfkf() {
            wkgbmnqykc();
            return this.f561wkgbmnqykc;
        }

        public String zoijcleaow() {
            wkgbmnqykc();
            return this.f558eablkybsjg;
        }

        public wkgbmnqykc(int i13, int i14, int i15) {
            String str;
            if (i13 != Integer.MIN_VALUE) {
                str = i13 + CardDateFormatTextWatcher.DIVIDER_CHARACTER;
            } else {
                str = "";
            }
            this.f559iobyxmoadg = str;
            this.f562zoijcleaow = i14;
            this.f560ppxfxbqfkf = i15;
            this.f561wkgbmnqykc = Integer.MIN_VALUE;
            this.f558eablkybsjg = "";
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public final byte[] f563eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f564iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f565ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final List f566wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final String f567zoijcleaow;

        public zoijcleaow(int i13, String str, int i14, List list, byte[] bArr) {
            this.f564iobyxmoadg = i13;
            this.f567zoijcleaow = str;
            this.f565ppxfxbqfkf = i14;
            this.f566wkgbmnqykc = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f563eablkybsjg = bArr;
        }

        public int iobyxmoadg() {
            int i13 = this.f565ppxfxbqfkf;
            if (i13 == 2) {
                return 2048;
            }
            if (i13 != 3) {
                return 0;
            }
            return UserVerificationMethods.USER_VERIFY_NONE;
        }
    }

    void iobyxmoadg(y2.yadqdtsiqt yadqdtsiqtVar, int i13);

    void ppxfxbqfkf();

    void zoijcleaow(y2.hcddaimhww hcddaimhwwVar, t3.oxmwwwfdhm oxmwwwfdhmVar, wkgbmnqykc wkgbmnqykcVar);
}
