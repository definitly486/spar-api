package ea;

import android.util.Property;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf extends Property {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final Property f31032iobyxmoadg = new ppxfxbqfkf("childrenAlpha");

    private ppxfxbqfkf(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public Float get(ViewGroup viewGroup) {
        Float f13 = (Float) viewGroup.getTag(da.gxszxtbevo.mtrl_internal_children_alpha_tag);
        return f13 != null ? f13 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public void set(ViewGroup viewGroup, Float f13) {
        float fFloatValue = f13.floatValue();
        viewGroup.setTag(da.gxszxtbevo.mtrl_internal_children_alpha_tag, f13);
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            viewGroup.getChildAt(i13).setAlpha(fFloatValue);
        }
    }
}
