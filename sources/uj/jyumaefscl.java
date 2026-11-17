package uj;

import kotlinx.coroutines.internal.UndeliveredElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jyumaefscl {
    public static final void iobyxmoadg(tg.draadjrbmk draadjrbmkVar, Object obj, lg.btonecajqb btonecajqbVar) {
        UndeliveredElementException undeliveredElementExceptionZoijcleaow = zoijcleaow(draadjrbmkVar, obj, null);
        if (undeliveredElementExceptionZoijcleaow != null) {
            pj.jpowsppfya.iobyxmoadg(btonecajqbVar, undeliveredElementExceptionZoijcleaow);
        }
    }

    public static /* synthetic */ UndeliveredElementException ppxfxbqfkf(tg.draadjrbmk draadjrbmkVar, Object obj, UndeliveredElementException undeliveredElementException, int i13, Object obj2) {
        if ((i13 & 2) != 0) {
            undeliveredElementException = null;
        }
        return zoijcleaow(draadjrbmkVar, obj, undeliveredElementException);
    }

    public static final UndeliveredElementException zoijcleaow(tg.draadjrbmk draadjrbmkVar, Object obj, UndeliveredElementException undeliveredElementException) {
        try {
            draadjrbmkVar.invoke(obj);
        } catch (Throwable th2) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th2) {
                return new UndeliveredElementException("Exception in undelivered element handler for " + obj, th2);
            }
            gg.lqeggnwhkg.iobyxmoadg(undeliveredElementException, th2);
        }
        return undeliveredElementException;
    }
}
