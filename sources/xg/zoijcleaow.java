package xg;

import java.util.Random;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow extends xg.iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final iobyxmoadg f122318jyumaefscl = new iobyxmoadg();

    public static final class iobyxmoadg extends ThreadLocal {
        iobyxmoadg() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // xg.iobyxmoadg
    public Random nufgyqmvbu() {
        Object obj = this.f122318jyumaefscl.get();
        zdlpuopuiu.dxjokdxxww(obj, "get(...)");
        return (Random) obj;
    }
}
