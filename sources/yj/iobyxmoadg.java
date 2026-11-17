package yj;

/* JADX INFO: loaded from: classes3.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: yj.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3196iobyxmoadg {
        public static /* synthetic */ Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, Object obj, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i13 & 1) != 0) {
                obj = null;
            }
            return iobyxmoadgVar.iobyxmoadg(obj, gxszxtbevoVar);
        }

        public static /* synthetic */ void ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, Object obj, int i13, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i13 & 1) != 0) {
                obj = null;
            }
            iobyxmoadgVar.eablkybsjg(obj);
        }

        public static /* synthetic */ boolean zoijcleaow(iobyxmoadg iobyxmoadgVar, Object obj, int i13, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i13 & 1) != 0) {
                obj = null;
            }
            return iobyxmoadgVar.ppxfxbqfkf(obj);
        }
    }

    void eablkybsjg(Object obj);

    Object iobyxmoadg(Object obj, lg.gxszxtbevo gxszxtbevoVar);

    boolean ppxfxbqfkf(Object obj);

    boolean wkgbmnqykc();
}
