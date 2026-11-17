package d00;

import android.content.Context;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import o30.wkgbmnqykc;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gtknphoqwx f26577iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gtknphoqwx f26578zoijcleaow;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f26575ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final String f26576wkgbmnqykc = b10.iobyxmoadg.MALE.wkgbmnqykc();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final String f26574eablkybsjg = b10.iobyxmoadg.FEMALE.wkgbmnqykc();

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public ppxfxbqfkf(final Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        this.f26577iobyxmoadg = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: d00.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ppxfxbqfkf.lqeggnwhkg(context);
            }
        });
        this.f26578zoijcleaow = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: d00.zoijcleaow
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ppxfxbqfkf.wkgbmnqykc(context);
            }
        });
    }

    private final String eablkybsjg() {
        return (String) this.f26578zoijcleaow.getValue();
    }

    private final String gxszxtbevo() {
        return (String) this.f26577iobyxmoadg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lqeggnwhkg(Context context) {
        return context.getString(zx.ppxfxbqfkf.male_gender_russian);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wkgbmnqykc(Context context) {
        return context.getString(zx.ppxfxbqfkf.female_gender_russian);
    }

    @Override // o30.wkgbmnqykc
    public String iobyxmoadg(String gender) {
        zdlpuopuiu.btonecajqb(gender, "gender");
        if (kcexrzcfyt.istkbnxepw(gxszxtbevo(), gender, true)) {
            return f26576wkgbmnqykc;
        }
        if (kcexrzcfyt.istkbnxepw(eablkybsjg(), gender, true)) {
            return f26574eablkybsjg;
        }
        return null;
    }
}
