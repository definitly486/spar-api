package f2;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.cllcsxoeiz;
import pj.dsvhmnatus;
import pj.ikoacuggdj;
import pj.krqnebusok;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: f2.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0708iobyxmoadg extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final C0708iobyxmoadg f32578zdlpuopuiu = new C0708iobyxmoadg();

        C0708iobyxmoadg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final List invoke(Context it) {
            zdlpuopuiu.btonecajqb(it, "it");
            return hg.jyumaefscl.wflxmlrfwp();
        }
    }

    public static final wg.wkgbmnqykc iobyxmoadg(String name, e2.zoijcleaow zoijcleaowVar, draadjrbmk produceMigrations, cllcsxoeiz scope) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(produceMigrations, "produceMigrations");
        zdlpuopuiu.btonecajqb(scope, "scope");
        return new ppxfxbqfkf(name, zoijcleaowVar, produceMigrations, scope);
    }

    public static /* synthetic */ wg.wkgbmnqykc zoijcleaow(String str, e2.zoijcleaow zoijcleaowVar, draadjrbmk draadjrbmkVar, cllcsxoeiz cllcsxoeizVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            zoijcleaowVar = null;
        }
        if ((i13 & 4) != 0) {
            draadjrbmkVar = C0708iobyxmoadg.f32578zdlpuopuiu;
        }
        if ((i13 & 8) != 0) {
            cllcsxoeizVar = dsvhmnatus.iobyxmoadg(ikoacuggdj.zoijcleaow().plus(krqnebusok.zoijcleaow(null, 1, null)));
        }
        return iobyxmoadg(str, zoijcleaowVar, draadjrbmkVar, cllcsxoeizVar);
    }
}
