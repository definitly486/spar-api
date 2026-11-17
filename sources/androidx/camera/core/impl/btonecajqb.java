package androidx.camera.core.impl;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface btonecajqb {

    public static abstract class iobyxmoadg {
        iobyxmoadg() {
        }

        public static iobyxmoadg iobyxmoadg(String str, Class cls) {
            return zoijcleaow(str, cls, null);
        }

        public static iobyxmoadg zoijcleaow(String str, Class cls, Object obj) {
            return new androidx.camera.core.impl.ppxfxbqfkf(str, cls, obj);
        }

        public abstract Class eablkybsjg();

        public abstract String ppxfxbqfkf();

        public abstract Object wkgbmnqykc();
    }

    public enum ppxfxbqfkf {
        ALWAYS_OVERRIDE,
        HIGH_PRIORITY_REQUIRED,
        REQUIRED,
        OPTIONAL
    }

    public interface zoijcleaow {
        boolean iobyxmoadg(iobyxmoadg iobyxmoadgVar);
    }

    static void iozdgvuglv(oxmwwwfdhm oxmwwwfdhmVar, btonecajqb btonecajqbVar, btonecajqb btonecajqbVar2, iobyxmoadg iobyxmoadgVar) {
        if (!Objects.equals(iobyxmoadgVar, rgvfuqvkyq.f3855oxmwwwfdhm)) {
            oxmwwwfdhmVar.ojitshcjhn(iobyxmoadgVar, btonecajqbVar2.nufgyqmvbu(iobyxmoadgVar), btonecajqbVar2.iobyxmoadg(iobyxmoadgVar));
            return;
        }
        dsvhmnatus.ppxfxbqfkf ppxfxbqfkfVar = (dsvhmnatus.ppxfxbqfkf) btonecajqbVar2.lqeggnwhkg(iobyxmoadgVar, null);
        oxmwwwfdhmVar.ojitshcjhn(iobyxmoadgVar, btonecajqbVar2.nufgyqmvbu(iobyxmoadgVar), cdpycssgdh.agtfadlqog.iobyxmoadg((dsvhmnatus.ppxfxbqfkf) btonecajqbVar.lqeggnwhkg(iobyxmoadgVar, null), ppxfxbqfkfVar));
    }

    static boolean pmvmpeiblj(ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2) {
        ppxfxbqfkf ppxfxbqfkfVar3 = ppxfxbqfkf.REQUIRED;
        return ppxfxbqfkfVar == ppxfxbqfkfVar3 && ppxfxbqfkfVar2 == ppxfxbqfkfVar3;
    }

    static btonecajqb wypolnanlu(btonecajqb btonecajqbVar, btonecajqb btonecajqbVar2) {
        if (btonecajqbVar == null && btonecajqbVar2 == null) {
            return kcexrzcfyt.jlmebxxoox();
        }
        oxmwwwfdhm oxmwwwfdhmVarIkoacuggdj = btonecajqbVar2 != null ? oxmwwwfdhm.ikoacuggdj(btonecajqbVar2) : oxmwwwfdhm.jhduphickx();
        if (btonecajqbVar != null) {
            Iterator it = btonecajqbVar.eablkybsjg().iterator();
            while (it.hasNext()) {
                iozdgvuglv(oxmwwwfdhmVarIkoacuggdj, btonecajqbVar2, btonecajqbVar, (iobyxmoadg) it.next());
            }
        }
        return kcexrzcfyt.ribwqtqdhb(oxmwwwfdhmVarIkoacuggdj);
    }

    Set eablkybsjg();

    Set gxszxtbevo(iobyxmoadg iobyxmoadgVar);

    Object iobyxmoadg(iobyxmoadg iobyxmoadgVar);

    Object lqeggnwhkg(iobyxmoadg iobyxmoadgVar, Object obj);

    ppxfxbqfkf nufgyqmvbu(iobyxmoadg iobyxmoadgVar);

    void ppxfxbqfkf(String str, zoijcleaow zoijcleaowVar);

    Object wkgbmnqykc(iobyxmoadg iobyxmoadgVar, ppxfxbqfkf ppxfxbqfkfVar);

    boolean zoijcleaow(iobyxmoadg iobyxmoadgVar);
}
