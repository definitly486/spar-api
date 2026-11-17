package tk;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public interface gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f110845iobyxmoadg = iobyxmoadg.f110847iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final gtknphoqwx f110846zoijcleaow = new iobyxmoadg.C2730iobyxmoadg();

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ iobyxmoadg f110847iobyxmoadg = new iobyxmoadg();

        /* JADX INFO: renamed from: tk.gtknphoqwx$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        private static final class C2730iobyxmoadg implements gtknphoqwx {
            @Override // tk.gtknphoqwx
            public boolean iobyxmoadg(int i13, bl.eablkybsjg source, int i14, boolean z13) {
                zdlpuopuiu.btonecajqb(source, "source");
                source.wflxmlrfwp(i14);
                return true;
            }

            @Override // tk.gtknphoqwx
            public boolean ppxfxbqfkf(int i13, List requestHeaders) {
                zdlpuopuiu.btonecajqb(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // tk.gtknphoqwx
            public boolean wkgbmnqykc(int i13, List responseHeaders, boolean z13) {
                zdlpuopuiu.btonecajqb(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // tk.gtknphoqwx
            public void zoijcleaow(int i13, tk.iobyxmoadg errorCode) {
                zdlpuopuiu.btonecajqb(errorCode, "errorCode");
            }
        }

        private iobyxmoadg() {
        }
    }

    boolean iobyxmoadg(int i13, bl.eablkybsjg eablkybsjgVar, int i14, boolean z13);

    boolean ppxfxbqfkf(int i13, List list);

    boolean wkgbmnqykc(int i13, List list, boolean z13);

    void zoijcleaow(int i13, tk.iobyxmoadg iobyxmoadgVar);
}
