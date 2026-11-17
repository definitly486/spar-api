package ei;

import hg.jyumaefscl;
import hg.stevsuqkhv;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import zg.btonecajqb;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends fi.iobyxmoadg {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final C0667iobyxmoadg f31365lqeggnwhkg = new C0667iobyxmoadg(null);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final iobyxmoadg f31366nufgyqmvbu = new iobyxmoadg(1, 0, 7);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final iobyxmoadg f31364dxjokdxxww = new iobyxmoadg(new int[0]);

    /* JADX INFO: renamed from: ei.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0667iobyxmoadg {
        public /* synthetic */ C0667iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final iobyxmoadg iobyxmoadg(InputStream stream) {
            zdlpuopuiu.btonecajqb(stream, "stream");
            DataInputStream dataInputStream = new DataInputStream(stream);
            btonecajqb btonecajqbVar = new btonecajqb(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(btonecajqbVar, 10));
            Iterator it = btonecajqbVar.iterator();
            while (it.hasNext()) {
                ((stevsuqkhv) it).iobyxmoadg();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrL = jyumaefscl.l(arrayList);
            return new iobyxmoadg(Arrays.copyOf(iArrL, iArrL.length));
        }

        private C0667iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        zdlpuopuiu.btonecajqb(numbers, "numbers");
    }

    public boolean nufgyqmvbu() {
        return gxszxtbevo(f31366nufgyqmvbu);
    }
}
