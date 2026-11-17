package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public abstract class weqkydbzbr {
    public static final opjhrmiecq iobyxmoadg(lg.btonecajqb btonecajqbVar) {
        opjhrmiecq opjhrmiecqVar = (opjhrmiecq) btonecajqbVar.get(opjhrmiecq.f5815ppxfxbqfkf);
        if (opjhrmiecqVar != null) {
            return opjhrmiecqVar;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final Object ppxfxbqfkf(tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        return iobyxmoadg(gxszxtbevoVar.getContext()).mbcevpiqjq(draadjrbmkVar, gxszxtbevoVar);
    }

    public static final Object zoijcleaow(tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        return iobyxmoadg(gxszxtbevoVar.getContext()).mbcevpiqjq(new iyctptxqzt(draadjrbmkVar), gxszxtbevoVar);
    }
}
