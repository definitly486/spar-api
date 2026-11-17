package zi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class sflfametgt {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f130123eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final sflfametgt f130124iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f130125ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Map f130126wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jh.uwvvkdfqfp f130127zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final sflfametgt iobyxmoadg(sflfametgt sflfametgtVar, jh.uwvvkdfqfp typeAliasDescriptor, List arguments) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeAliasDescriptor, "typeAliasDescriptor");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(arguments, "arguments");
            List parameters = typeAliasDescriptor.btonecajqb().getParameters();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parameters, "getParameters(...)");
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(parameters, 10));
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                arrayList.add(((jh.yfnezrywwk) it.next()).iobyxmoadg());
            }
            return new sflfametgt(sflfametgtVar, typeAliasDescriptor, arguments, hg.tzroggbefp.kcexrzcfyt(hg.jyumaefscl.w(arrayList, arguments)), null);
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ sflfametgt(sflfametgt sflfametgtVar, jh.uwvvkdfqfp uwvvkdfqfpVar, List list, Map map, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(sflfametgtVar, uwvvkdfqfpVar, list, map);
    }

    public final List iobyxmoadg() {
        return this.f130125ppxfxbqfkf;
    }

    public final iwxlajgraz ppxfxbqfkf(zeieaojujs constructor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(constructor, "constructor");
        jh.nufgyqmvbu nufgyqmvbuVarYlkuphrtab = constructor.ylkuphrtab();
        if (nufgyqmvbuVarYlkuphrtab instanceof jh.yfnezrywwk) {
            return (iwxlajgraz) this.f130126wkgbmnqykc.get(nufgyqmvbuVarYlkuphrtab);
        }
        return null;
    }

    public final boolean wkgbmnqykc(jh.uwvvkdfqfp descriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f130127zoijcleaow, descriptor)) {
            sflfametgt sflfametgtVar = this.f130124iobyxmoadg;
            if (!(sflfametgtVar != null ? sflfametgtVar.wkgbmnqykc(descriptor) : false)) {
                return false;
            }
        }
        return true;
    }

    public final jh.uwvvkdfqfp zoijcleaow() {
        return this.f130127zoijcleaow;
    }

    private sflfametgt(sflfametgt sflfametgtVar, jh.uwvvkdfqfp uwvvkdfqfpVar, List list, Map map) {
        this.f130124iobyxmoadg = sflfametgtVar;
        this.f130127zoijcleaow = uwvvkdfqfpVar;
        this.f130125ppxfxbqfkf = list;
        this.f130126wkgbmnqykc = map;
    }
}
