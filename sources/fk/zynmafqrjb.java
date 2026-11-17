package fk;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zynmafqrjb {
    public static final bk.zoijcleaow iobyxmoadg(String serialName, Enum[] values, String[] names, Annotation[][] entryAnnotations, Annotation[] annotationArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(serialName, "serialName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(values, "values");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(names, "names");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(entryAnnotations, "entryAnnotations");
        esjtqupxsv esjtqupxsvVar = new esjtqupxsv(serialName, values.length);
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                esjtqupxsvVar.iwizpuwonk(annotation);
            }
        }
        int length = values.length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            Enum r13 = values[i13];
            int i15 = i14 + 1;
            String strName = (String) hg.agtfadlqog.weqkydbzbr(names, i14);
            if (strName == null) {
                strName = r13.name();
            }
            iyctptxqzt.rgvfuqvkyq(esjtqupxsvVar, strName, false, 2, null);
            Annotation[] annotationArr2 = (Annotation[]) hg.agtfadlqog.weqkydbzbr(entryAnnotations, i14);
            if (annotationArr2 != null) {
                for (Annotation annotation2 : annotationArr2) {
                    esjtqupxsvVar.jyumaefscl(annotation2);
                }
            }
            i13++;
            i14 = i15;
        }
        return new pmvmpeiblj(serialName, values, esjtqupxsvVar);
    }

    public static final bk.zoijcleaow zoijcleaow(String serialName, Enum[] values) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(serialName, "serialName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(values, "values");
        return new pmvmpeiblj(serialName, values);
    }
}
