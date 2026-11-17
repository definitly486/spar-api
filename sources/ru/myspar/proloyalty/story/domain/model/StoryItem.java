package ru.myspar.proloyalty.story.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016JT\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u001a\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u00106\u001a\u00020\u00068F¢\u0006\f\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010*¨\u00067"}, d2 = {"Lru/myspar/proloyalty/story/domain/model/StoryItem;", "Landroid/os/Parcelable;", "", "id", "title", "imageUrl", "", "isAdult", "", "Lru/myspar/proloyalty/story/domain/model/StorySlide;", "slides", "", "onboardingTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Integer;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Integer;)Lru/myspar/proloyalty/story/domain/model/StoryItem;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "lqeggnwhkg", "jyumaefscl", "ojitshcjhn", "iwizpuwonk", "Z", "nufgyqmvbu", "()Z", "cqumvgiudr", "Ljava/util/List;", "gxszxtbevo", "()Ljava/util/List;", "esjtqupxsv", "Ljava/lang/Integer;", "eablkybsjg", "()Ljava/lang/Integer;", "dxjokdxxww", "isViewed$annotations", "()V", "isViewed", "story_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StoryItem implements Parcelable {
    public static final Parcelable.Creator<StoryItem> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final List slides;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer onboardingTime;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAdult;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final StoryItem createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z13 = parcel.readInt() != 0;
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(StorySlide.CREATOR.createFromParcel(parcel));
            }
            return new StoryItem(string, string2, string3, z13, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final StoryItem[] newArray(int i13) {
            return new StoryItem[i13];
        }
    }

    public StoryItem(String id2, String title, String imageUrl, boolean z13, List slides, Integer num) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
        zdlpuopuiu.btonecajqb(slides, "slides");
        this.id = id2;
        this.title = title;
        this.imageUrl = imageUrl;
        this.isAdult = z13;
        this.slides = slides;
        this.onboardingTime = num;
    }

    public static /* synthetic */ StoryItem ppxfxbqfkf(StoryItem storyItem, String str, String str2, String str3, boolean z13, List list, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = storyItem.id;
        }
        if ((i13 & 2) != 0) {
            str2 = storyItem.title;
        }
        String str4 = str2;
        if ((i13 & 4) != 0) {
            str3 = storyItem.imageUrl;
        }
        String str5 = str3;
        if ((i13 & 8) != 0) {
            z13 = storyItem.isAdult;
        }
        boolean z14 = z13;
        if ((i13 & 16) != 0) {
            list = storyItem.slides;
        }
        List list2 = list;
        if ((i13 & 32) != 0) {
            num = storyItem.onboardingTime;
        }
        return storyItem.zoijcleaow(str, str4, str5, z14, list2, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean dxjokdxxww() {
        List list = this.slides;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((StorySlide) it.next()).getIsViewed()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final Integer getOnboardingTime() {
        return this.onboardingTime;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoryItem)) {
            return false;
        }
        StoryItem storyItem = (StoryItem) other;
        return zdlpuopuiu.eablkybsjg(this.id, storyItem.id) && zdlpuopuiu.eablkybsjg(this.title, storyItem.title) && zdlpuopuiu.eablkybsjg(this.imageUrl, storyItem.imageUrl) && this.isAdult == storyItem.isAdult && zdlpuopuiu.eablkybsjg(this.slides, storyItem.slides) && zdlpuopuiu.eablkybsjg(this.onboardingTime, storyItem.onboardingTime);
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final List getSlides() {
        return this.slides;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + Boolean.hashCode(this.isAdult)) * 31) + this.slides.hashCode()) * 31;
        Integer num = this.onboardingTime;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getIsAdult() {
        return this.isAdult;
    }

    /* JADX INFO: renamed from: ojitshcjhn, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public String toString() {
        return "StoryItem(id=" + this.id + ", title=" + this.title + ", imageUrl=" + this.imageUrl + ", isAdult=" + this.isAdult + ", slides=" + this.slides + ", onboardingTime=" + this.onboardingTime + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        int iIntValue;
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.title);
        dest.writeString(this.imageUrl);
        dest.writeInt(this.isAdult ? 1 : 0);
        List list = this.slides;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((StorySlide) it.next()).writeToParcel(dest, flags);
        }
        Integer num = this.onboardingTime;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
    }

    public final StoryItem zoijcleaow(String id2, String title, String imageUrl, boolean isAdult, List slides, Integer onboardingTime) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
        zdlpuopuiu.btonecajqb(slides, "slides");
        return new StoryItem(id2, title, imageUrl, isAdult, slides, onboardingTime);
    }
}
