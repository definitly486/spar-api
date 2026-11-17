package kk;

import android.content.Context;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zv {
    public static final String iobyxmoadg(vu vuVar, Context context) {
        String string;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(vuVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        if (vuVar instanceof rt) {
            return ((rt) vuVar).f58471iobyxmoadg.toString();
        }
        if (!(vuVar instanceof ms)) {
            throw new NoWhenBranchMatchedException();
        }
        ms msVar = (ms) vuVar;
        if (msVar.f57690zoijcleaow.isEmpty()) {
            string = context.getString(msVar.f57689iobyxmoadg);
        } else {
            int size = msVar.f57690zoijcleaow.size();
            Object[] objArr = new Object[size];
            for (int i13 = 0; i13 < size; i13++) {
                Object objIobyxmoadg = msVar.f57690zoijcleaow.get(i13);
                if (objIobyxmoadg instanceof vu) {
                    objIobyxmoadg = iobyxmoadg((vu) objIobyxmoadg, context);
                }
                objArr[i13] = objIobyxmoadg;
            }
            string = context.getString(msVar.f57689iobyxmoadg, Arrays.copyOf(objArr, size));
        }
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "{\n        if (args.isEmp…d, *args)\n        }\n    }");
        return string;
    }

    public static final ms zoijcleaow(int i13) {
        return new ms(i13, hg.jyumaefscl.wflxmlrfwp());
    }
}
