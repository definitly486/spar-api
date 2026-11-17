package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
class BaseSlider$SliderState extends View.BaseSavedState {
    public static final Parcelable.Creator<BaseSlider$SliderState> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    boolean f23060cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    float f23061iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    ArrayList f23062jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    float f23063yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    float f23064zdlpuopuiu;

    class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public BaseSlider$SliderState createFromParcel(Parcel parcel) {
            return new BaseSlider$SliderState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public BaseSlider$SliderState[] newArray(int i13) {
            return new BaseSlider$SliderState[i13];
        }
    }

    /* synthetic */ BaseSlider$SliderState(Parcel parcel, com.google.android.material.slider.iobyxmoadg iobyxmoadgVar) {
        this(parcel);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        super.writeToParcel(parcel, i13);
        parcel.writeFloat(this.f23064zdlpuopuiu);
        parcel.writeFloat(this.f23063yggfygwlhe);
        parcel.writeList(this.f23062jyumaefscl);
        parcel.writeFloat(this.f23061iwizpuwonk);
        parcel.writeBooleanArray(new boolean[]{this.f23060cqumvgiudr});
    }

    private BaseSlider$SliderState(Parcel parcel) {
        super(parcel);
        this.f23064zdlpuopuiu = parcel.readFloat();
        this.f23063yggfygwlhe = parcel.readFloat();
        ArrayList arrayList = new ArrayList();
        this.f23062jyumaefscl = arrayList;
        parcel.readList(arrayList, Float.class.getClassLoader());
        this.f23061iwizpuwonk = parcel.readFloat();
        this.f23060cqumvgiudr = parcel.createBooleanArray()[0];
    }
}
