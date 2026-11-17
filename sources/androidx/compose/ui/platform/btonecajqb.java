package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
public final class btonecajqb implements dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AccessibilityManager f6771iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final iobyxmoadg f6770zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final int f6769ppxfxbqfkf = 8;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public btonecajqb(Context context) {
        Object systemService = context.getSystemService("accessibility");
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f6771iobyxmoadg = (AccessibilityManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.compose.ui.platform.dxjokdxxww
    public long iobyxmoadg(long j13, boolean z13, boolean z14, boolean z15) {
        int i13;
        int i14 = z13;
        if (j13 >= 2147483647L) {
            return j13;
        }
        if (z14) {
            i13 = (z13 ? 1 : 0) | 2;
        }
        if (z15) {
            i14 = i13;
            i14 = (i14 == true ? 1 : 0) | 4;
        }
        i14 = i13;
        if (Build.VERSION.SDK_INT >= 29) {
            int iIobyxmoadg = ikoacuggdj.f6973iobyxmoadg.iobyxmoadg(this.f6771iobyxmoadg, (int) j13, i14);
            if (iIobyxmoadg != Integer.MAX_VALUE) {
                return iIobyxmoadg;
            }
        } else if (!z15 || !this.f6771iobyxmoadg.isTouchExplorationEnabled()) {
            return j13;
        }
        return Long.MAX_VALUE;
    }
}
