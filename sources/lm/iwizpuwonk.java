package lm;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
final class iwizpuwonk implements jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final jyumaefscl f63454iobyxmoadg = new iwizpuwonk();

    iwizpuwonk() {
    }

    static Annotation[] iobyxmoadg(Annotation[] annotationArr) {
        if (cqumvgiudr.draadjrbmk(annotationArr, jyumaefscl.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f63454iobyxmoadg;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return jyumaefscl.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof jyumaefscl;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + jyumaefscl.class.getName() + "()";
    }
}
