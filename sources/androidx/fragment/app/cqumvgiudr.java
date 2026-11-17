package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
class cqumvgiudr implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final FragmentManager f9204zdlpuopuiu;

    class iobyxmoadg implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ pkzmftpjix f9206zdlpuopuiu;

        iobyxmoadg(pkzmftpjix pkzmftpjixVar) {
            this.f9206zdlpuopuiu = pkzmftpjixVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentGtknphoqwx = this.f9206zdlpuopuiu.gtknphoqwx();
            this.f9206zdlpuopuiu.wflxmlrfwp();
            ntlheqmsrt.yggfygwlhe((ViewGroup) fragmentGtknphoqwx.mView.getParent(), cqumvgiudr.this.f9204zdlpuopuiu).vdvldrhtss();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    cqumvgiudr(FragmentManager fragmentManager) {
        this.f9204zdlpuopuiu = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        pkzmftpjix pkzmftpjixVarZynmafqrjb;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f9204zdlpuopuiu);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k2.ppxfxbqfkf.Fragment);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(k2.ppxfxbqfkf.Fragment_android_name);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(k2.ppxfxbqfkf.Fragment_android_id, -1);
        String string = typedArrayObtainStyledAttributes.getString(k2.ppxfxbqfkf.Fragment_android_tag);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !jyumaefscl.zoijcleaow(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id2 = view != null ? view.getId() : 0;
        if (id2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentZfvoamnweg = resourceId != -1 ? this.f9204zdlpuopuiu.zfvoamnweg(resourceId) : null;
        if (fragmentZfvoamnweg == null && string != null) {
            fragmentZfvoamnweg = this.f9204zdlpuopuiu.oipsdeybqn(string);
        }
        if (fragmentZfvoamnweg == null && id2 != -1) {
            fragmentZfvoamnweg = this.f9204zdlpuopuiu.zfvoamnweg(id2);
        }
        if (fragmentZfvoamnweg == null) {
            fragmentZfvoamnweg = this.f9204zdlpuopuiu.dvvnrvtcbc().iobyxmoadg(context.getClassLoader(), attributeValue);
            fragmentZfvoamnweg.mFromLayout = true;
            fragmentZfvoamnweg.mFragmentId = resourceId != 0 ? resourceId : id2;
            fragmentZfvoamnweg.mContainerId = id2;
            fragmentZfvoamnweg.mTag = string;
            fragmentZfvoamnweg.mInLayout = true;
            FragmentManager fragmentManager = this.f9204zdlpuopuiu;
            fragmentZfvoamnweg.mFragmentManager = fragmentManager;
            fragmentZfvoamnweg.mHost = fragmentManager.lxfrhoxuzk();
            fragmentZfvoamnweg.onInflate(this.f9204zdlpuopuiu.lxfrhoxuzk().gxszxtbevo(), attributeSet, fragmentZfvoamnweg.mSavedFragmentState);
            pkzmftpjixVarZynmafqrjb = this.f9204zdlpuopuiu.draadjrbmk(fragmentZfvoamnweg);
            if (FragmentManager.rhgxfdycjh(2)) {
                Log.v("FragmentManager", "Fragment " + fragmentZfvoamnweg + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (fragmentZfvoamnweg.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
            }
            fragmentZfvoamnweg.mInLayout = true;
            FragmentManager fragmentManager2 = this.f9204zdlpuopuiu;
            fragmentZfvoamnweg.mFragmentManager = fragmentManager2;
            fragmentZfvoamnweg.mHost = fragmentManager2.lxfrhoxuzk();
            fragmentZfvoamnweg.onInflate(this.f9204zdlpuopuiu.lxfrhoxuzk().gxszxtbevo(), attributeSet, fragmentZfvoamnweg.mSavedFragmentState);
            pkzmftpjixVarZynmafqrjb = this.f9204zdlpuopuiu.zynmafqrjb(fragmentZfvoamnweg);
            if (FragmentManager.rhgxfdycjh(2)) {
                Log.v("FragmentManager", "Retained Fragment " + fragmentZfvoamnweg + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        l2.zoijcleaow.lqeggnwhkg(fragmentZfvoamnweg, viewGroup);
        fragmentZfvoamnweg.mContainer = viewGroup;
        pkzmftpjixVarZynmafqrjb.wflxmlrfwp();
        pkzmftpjixVarZynmafqrjb.btonecajqb();
        View view2 = fragmentZfvoamnweg.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentZfvoamnweg.mView.getTag() == null) {
            fragmentZfvoamnweg.mView.setTag(string);
        }
        fragmentZfvoamnweg.mView.addOnAttachStateChangeListener(new iobyxmoadg(pkzmftpjixVarZynmafqrjb));
        return fragmentZfvoamnweg.mView;
    }
}
