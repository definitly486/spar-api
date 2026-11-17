package g6;

import hg.ikoacuggdj;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dsvhmnatus {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final zoijcleaow f36375wkgbmnqykc = new zoijcleaow(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final UUID f36376iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Set f36377ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final p6.yggfygwlhe f36378zoijcleaow;

    public static abstract class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final Set f36379eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Class f36380iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private UUID f36381ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private p6.yggfygwlhe f36382wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private boolean f36383zoijcleaow;

        public iobyxmoadg(Class workerClass) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workerClass, "workerClass");
            this.f36380iobyxmoadg = workerClass;
            UUID uuidRandomUUID = UUID.randomUUID();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(uuidRandomUUID, "randomUUID()");
            this.f36381ppxfxbqfkf = uuidRandomUUID;
            String string = this.f36381ppxfxbqfkf.toString();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "id.toString()");
            String name = workerClass.getName();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "workerClass.name");
            this.f36382wkgbmnqykc = new p6.yggfygwlhe(string, name);
            String name2 = workerClass.getName();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name2, "workerClass.name");
            this.f36379eablkybsjg = ikoacuggdj.lqeggnwhkg(name2);
        }

        public final iobyxmoadg btonecajqb(UUID id2) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(id2, "id");
            this.f36381ppxfxbqfkf = id2;
            String string = id2.toString();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "id.toString()");
            this.f36382wkgbmnqykc = new p6.yggfygwlhe(string, this.f36382wkgbmnqykc);
            return lqeggnwhkg();
        }

        public final iobyxmoadg draadjrbmk(androidx.work.zoijcleaow inputData) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(inputData, "inputData");
            this.f36382wkgbmnqykc.f75793eablkybsjg = inputData;
            return lqeggnwhkg();
        }

        public final iobyxmoadg dxjokdxxww(wkgbmnqykc constraints) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(constraints, "constraints");
            this.f36382wkgbmnqykc.f75789btonecajqb = constraints;
            return lqeggnwhkg();
        }

        public final UUID eablkybsjg() {
            return this.f36381ppxfxbqfkf;
        }

        public iobyxmoadg gtknphoqwx(long j13, TimeUnit timeUnit) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(timeUnit, "timeUnit");
            this.f36382wkgbmnqykc.f75800lqeggnwhkg = timeUnit.toMillis(j13);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f36382wkgbmnqykc.f75800lqeggnwhkg) {
                return lqeggnwhkg();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        public final Set gxszxtbevo() {
            return this.f36379eablkybsjg;
        }

        public final iobyxmoadg iobyxmoadg(String tag) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
            this.f36379eablkybsjg.add(tag);
            return lqeggnwhkg();
        }

        public abstract iobyxmoadg lqeggnwhkg();

        public final p6.yggfygwlhe nufgyqmvbu() {
            return this.f36382wkgbmnqykc;
        }

        public abstract dsvhmnatus ppxfxbqfkf();

        public final boolean wkgbmnqykc() {
            return this.f36383zoijcleaow;
        }

        public final dsvhmnatus zoijcleaow() {
            dsvhmnatus dsvhmnatusVarPpxfxbqfkf = ppxfxbqfkf();
            wkgbmnqykc wkgbmnqykcVar = this.f36382wkgbmnqykc.f75789btonecajqb;
            boolean z13 = wkgbmnqykcVar.lqeggnwhkg() || wkgbmnqykcVar.nufgyqmvbu() || wkgbmnqykcVar.dxjokdxxww() || wkgbmnqykcVar.btonecajqb();
            p6.yggfygwlhe yggfygwlheVar = this.f36382wkgbmnqykc;
            if (yggfygwlheVar.f75806vdvldrhtss) {
                if (z13) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (yggfygwlheVar.f75800lqeggnwhkg > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            if (yggfygwlheVar.gtknphoqwx() == null) {
                p6.yggfygwlhe yggfygwlheVar2 = this.f36382wkgbmnqykc;
                yggfygwlheVar2.kcexrzcfyt(dsvhmnatus.f36375wkgbmnqykc.zoijcleaow(yggfygwlheVar2.f75804ppxfxbqfkf));
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(uuidRandomUUID, "randomUUID()");
            btonecajqb(uuidRandomUUID);
            return dsvhmnatusVarPpxfxbqfkf;
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String zoijcleaow(String str) {
            List listIxidwrxhsl = mj.kcexrzcfyt.ixidwrxhsl(str, new String[]{"."}, false, 0, 6, null);
            String str2 = listIxidwrxhsl.size() == 1 ? (String) listIxidwrxhsl.get(0) : (String) hg.jyumaefscl.skhdrjzrfn(listIxidwrxhsl);
            return str2.length() <= 127 ? str2 : mj.kcexrzcfyt.y(str2, 127);
        }

        private zoijcleaow() {
        }
    }

    public dsvhmnatus(UUID id2, p6.yggfygwlhe workSpec, Set tags) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(id2, "id");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workSpec, "workSpec");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tags, "tags");
        this.f36376iobyxmoadg = id2;
        this.f36378zoijcleaow = workSpec;
        this.f36377ppxfxbqfkf = tags;
    }

    public UUID iobyxmoadg() {
        return this.f36376iobyxmoadg;
    }

    public final Set ppxfxbqfkf() {
        return this.f36377ppxfxbqfkf;
    }

    public final p6.yggfygwlhe wkgbmnqykc() {
        return this.f36378zoijcleaow;
    }

    public final String zoijcleaow() {
        String string = iobyxmoadg().toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "id.toString()");
        return string;
    }
}
