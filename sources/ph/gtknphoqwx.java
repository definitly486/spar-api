package ph;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gtknphoqwx {
    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    public static final lqeggnwhkg iobyxmoadg(Annotation[] annotationArr, ii.ppxfxbqfkf fqName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(annotationArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        for (Annotation annotation : annotationArr) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gxszxtbevo.eablkybsjg(sg.iobyxmoadg.zoijcleaow(sg.iobyxmoadg.iobyxmoadg(annotation))).iobyxmoadg(), fqName)) {
                if (annotation != null) {
                    return new lqeggnwhkg(annotation);
                }
                return null;
            }
        }
        annotation = null;
        if (annotation != null) {
            return new lqeggnwhkg(annotation);
        }
        return null;
    }

    public static final List zoijcleaow(Annotation[] annotationArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new lqeggnwhkg(annotation));
        }
        return arrayList;
    }
}
