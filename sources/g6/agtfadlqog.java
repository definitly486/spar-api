package g6;

/* JADX INFO: loaded from: classes2.dex */
public abstract class agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final String f36362iobyxmoadg;

    static {
        String strDxjokdxxww = yggfygwlhe.dxjokdxxww("InputMerger");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strDxjokdxxww, "tagWithPrefix(\"InputMerger\")");
        f36362iobyxmoadg = strDxjokdxxww;
    }

    public static final draadjrbmk iobyxmoadg(String className) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(className, "className");
        try {
            Object objNewInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objNewInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
            return (draadjrbmk) objNewInstance;
        } catch (Exception e13) {
            yggfygwlhe.eablkybsjg().wkgbmnqykc(f36362iobyxmoadg, "Trouble instantiating " + className, e13);
            return null;
        }
    }
}
