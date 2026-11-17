package androidx.compose.foundation.lazy.layout;

/* JADX INFO: loaded from: classes.dex */
public abstract class rgvfuqvkyq {

    public interface iobyxmoadg {

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.rgvfuqvkyq$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C0088iobyxmoadg implements tg.draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final C0088iobyxmoadg f5109zdlpuopuiu = new C0088iobyxmoadg();

            C0088iobyxmoadg() {
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return iobyxmoadg(((Number) obj).intValue());
            }

            public final Void iobyxmoadg(int i13) {
                return null;
            }
        }

        tg.draadjrbmk getKey();

        default tg.draadjrbmk getType() {
            return C0088iobyxmoadg.f5109zdlpuopuiu;
        }
    }

    public final Object btonecajqb(int i13) {
        gxszxtbevo.iobyxmoadg iobyxmoadgVar = gtknphoqwx().get(i13);
        return ((iobyxmoadg) iobyxmoadgVar.ppxfxbqfkf()).getType().invoke(Integer.valueOf(i13 - iobyxmoadgVar.zoijcleaow()));
    }

    public final int draadjrbmk() {
        return gtknphoqwx().getSize();
    }

    public abstract gxszxtbevo gtknphoqwx();

    public final Object wflxmlrfwp(int i13) {
        Object objInvoke;
        gxszxtbevo.iobyxmoadg iobyxmoadgVar = gtknphoqwx().get(i13);
        int iZoijcleaow = i13 - iobyxmoadgVar.zoijcleaow();
        tg.draadjrbmk key = ((iobyxmoadg) iobyxmoadgVar.ppxfxbqfkf()).getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(iZoijcleaow))) == null) ? roivzttewh.iobyxmoadg(i13) : objInvoke;
    }
}
