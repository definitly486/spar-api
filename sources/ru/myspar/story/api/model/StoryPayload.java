package ru.myspar.story.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.story.domain.model.StoryItem;
import ru.myspar.story.domain.model.StoryNavLink;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/myspar/story/api/model/StoryPayload;", "Landroid/os/Parcelable;", "<init>", "()V", "Groups", "Onboarding", "Lru/myspar/story/api/model/StoryPayload$Groups;", "Lru/myspar/story/api/model/StoryPayload$Onboarding;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class StoryPayload implements Parcelable {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lru/myspar/story/api/model/StoryPayload$Groups;", "Lru/myspar/story/api/model/StoryPayload;", "", "initialStoryId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "zoijcleaow", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Groups extends StoryPayload {
        public static final Parcelable.Creator<Groups> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String initialStoryId;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Groups createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Groups(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Groups[] newArray(int i13) {
                return new Groups[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Groups(String initialStoryId) {
            super(null);
            zdlpuopuiu.btonecajqb(initialStoryId, "initialStoryId");
            this.initialStoryId = initialStoryId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Groups) && zdlpuopuiu.eablkybsjg(this.initialStoryId, ((Groups) other).initialStoryId);
        }

        public int hashCode() {
            return this.initialStoryId.hashCode();
        }

        public String toString() {
            return "Groups(initialStoryId=" + this.initialStoryId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.initialStoryId);
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final String getInitialStoryId() {
            return this.initialStoryId;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/myspar/story/api/model/StoryPayload$Onboarding;", "Lru/myspar/story/api/model/StoryPayload;", "Lru/myspar/story/domain/model/StoryItem;", "story", "Lru/myspar/story/domain/model/StoryNavLink;", "endPoint", "<init>", "(Lru/myspar/story/domain/model/StoryItem;Lru/myspar/story/domain/model/StoryNavLink;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/story/domain/model/StoryItem;", "ppxfxbqfkf", "()Lru/myspar/story/domain/model/StoryItem;", "yggfygwlhe", "Lru/myspar/story/domain/model/StoryNavLink;", "zoijcleaow", "()Lru/myspar/story/domain/model/StoryNavLink;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Onboarding extends StoryPayload {
        public static final Parcelable.Creator<Onboarding> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final StoryNavLink endPoint;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final StoryItem story;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Onboarding createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Onboarding((StoryItem) parcel.readParcelable(Onboarding.class.getClassLoader()), (StoryNavLink) parcel.readParcelable(Onboarding.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Onboarding[] newArray(int i13) {
                return new Onboarding[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Onboarding(StoryItem story, StoryNavLink endPoint) {
            super(null);
            zdlpuopuiu.btonecajqb(story, "story");
            zdlpuopuiu.btonecajqb(endPoint, "endPoint");
            this.story = story;
            this.endPoint = endPoint;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Onboarding)) {
                return false;
            }
            Onboarding onboarding = (Onboarding) other;
            return zdlpuopuiu.eablkybsjg(this.story, onboarding.story) && zdlpuopuiu.eablkybsjg(this.endPoint, onboarding.endPoint);
        }

        public int hashCode() {
            return (this.story.hashCode() * 31) + this.endPoint.hashCode();
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final StoryItem getStory() {
            return this.story;
        }

        public String toString() {
            return "Onboarding(story=" + this.story + ", endPoint=" + this.endPoint + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeParcelable(this.story, flags);
            dest.writeParcelable(this.endPoint, flags);
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final StoryNavLink getEndPoint() {
            return this.endPoint;
        }
    }

    public /* synthetic */ StoryPayload(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private StoryPayload() {
    }
}
