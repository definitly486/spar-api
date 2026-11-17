package ru.myspar.proloyalty.story.impl.presentation.store;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.story.domain.model.StoryItem;
import ru.myspar.proloyalty.story.domain.model.StoryNavLink;

/* JADX INFO: renamed from: ru.myspar.proloyalty.story.impl.presentation.store.StoryStore$State, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bH×\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H×\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"ru/myspar/proloyalty/story/impl/presentation/store/StoryStore$State", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/story/impl/presentation/store/StoryStore$State$Content;", "content", "<init>", "(Lru/myspar/proloyalty/story/impl/presentation/store/StoryStore$State$Content;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/story/impl/presentation/store/StoryStore$State;", "zoijcleaow", "(Lru/myspar/proloyalty/story/impl/presentation/store/StoryStore$State$Content;)Lru/myspar/proloyalty/story/impl/presentation/store/StoryStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/story/impl/presentation/store/StoryStore$State$Content;", "ppxfxbqfkf", "()Lru/myspar/proloyalty/story/impl/presentation/store/StoryStore$State$Content;", "Content", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final Content content;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.story.impl.presentation.store.StoryStore$State$Content */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/myspar/proloyalty/story/impl/presentation/store/StoryStore$State$Content;", "Landroid/os/Parcelable;", "<init>", "()V", "Groups", "Onboarding", "Lru/myspar/proloyalty/story/impl/presentation/store/StoryStore$State$Content$Groups;", "Lru/myspar/proloyalty/story/impl/presentation/store/StoryStore$State$Content$Onboarding;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Content implements Parcelable {

        /* JADX INFO: renamed from: ru.myspar.proloyalty.story.impl.presentation.store.StoryStore$State$Content$Groups, reason: from toString */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bH×\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H×\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0013¨\u0006!"}, d2 = {"Lru/myspar/proloyalty/story/impl/presentation/store/StoryStore$State$Content$Groups;", "Lru/myspar/proloyalty/story/impl/presentation/store/StoryStore$State$Content;", "", "Lru/myspar/proloyalty/story/domain/model/StoryItem;", "stories", "", "initialStoryId", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/util/List;", "ppxfxbqfkf", "()Ljava/util/List;", "yggfygwlhe", "Ljava/lang/String;", "zoijcleaow", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Groups extends Content {
            public static final Parcelable.Creator<Groups> CREATOR = new iobyxmoadg();

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
            private final String initialStoryId;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
            private final List stories;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.story.impl.presentation.store.StoryStore$State$Content$Groups$iobyxmoadg */
            public static final class iobyxmoadg implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
                public final Groups createFromParcel(Parcel parcel) {
                    zdlpuopuiu.btonecajqb(parcel, "parcel");
                    int i13 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i13);
                    for (int i14 = 0; i14 != i13; i14++) {
                        arrayList.add(parcel.readParcelable(Groups.class.getClassLoader()));
                    }
                    return new Groups(arrayList, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
                public final Groups[] newArray(int i13) {
                    return new Groups[i13];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Groups(List stories, String initialStoryId) {
                super(null);
                zdlpuopuiu.btonecajqb(stories, "stories");
                zdlpuopuiu.btonecajqb(initialStoryId, "initialStoryId");
                this.stories = stories;
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
                if (!(other instanceof Groups)) {
                    return false;
                }
                Groups groups = (Groups) other;
                return zdlpuopuiu.eablkybsjg(this.stories, groups.stories) && zdlpuopuiu.eablkybsjg(this.initialStoryId, groups.initialStoryId);
            }

            public int hashCode() {
                return (this.stories.hashCode() * 31) + this.initialStoryId.hashCode();
            }

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
            public final List getStories() {
                return this.stories;
            }

            public String toString() {
                return "Groups(stories=" + this.stories + ", initialStoryId=" + this.initialStoryId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                zdlpuopuiu.btonecajqb(dest, "dest");
                List list = this.stories;
                dest.writeInt(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable((Parcelable) it.next(), flags);
                }
                dest.writeString(this.initialStoryId);
            }

            /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
            public final String getInitialStoryId() {
                return this.initialStoryId;
            }
        }

        /* JADX INFO: renamed from: ru.myspar.proloyalty.story.impl.presentation.store.StoryStore$State$Content$Onboarding, reason: from toString */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H×\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/myspar/proloyalty/story/impl/presentation/store/StoryStore$State$Content$Onboarding;", "Lru/myspar/proloyalty/story/impl/presentation/store/StoryStore$State$Content;", "Lru/myspar/proloyalty/story/domain/model/StoryItem;", "story", "Lru/myspar/proloyalty/story/domain/model/StoryNavLink;", "endPoint", "<init>", "(Lru/myspar/proloyalty/story/domain/model/StoryItem;Lru/myspar/proloyalty/story/domain/model/StoryNavLink;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/story/domain/model/StoryItem;", "ppxfxbqfkf", "()Lru/myspar/proloyalty/story/domain/model/StoryItem;", "yggfygwlhe", "Lru/myspar/proloyalty/story/domain/model/StoryNavLink;", "zoijcleaow", "()Lru/myspar/proloyalty/story/domain/model/StoryNavLink;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Onboarding extends Content {
            public static final Parcelable.Creator<Onboarding> CREATOR = new iobyxmoadg();

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
            private final StoryNavLink endPoint;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
            private final StoryItem story;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.story.impl.presentation.store.StoryStore$State$Content$Onboarding$iobyxmoadg */
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

        public /* synthetic */ Content(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private Content() {
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.story.impl.presentation.store.StoryStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State((Content) parcel.readParcelable(State.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(Content content) {
        this.content = content;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof State) && zdlpuopuiu.eablkybsjg(this.content, ((State) other).content);
    }

    public int hashCode() {
        Content content = this.content;
        if (content == null) {
            return 0;
        }
        return content.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final Content getContent() {
        return this.content;
    }

    public String toString() {
        return "State(content=" + this.content + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.content, flags);
    }

    public final State zoijcleaow(Content content) {
        return new State(content);
    }
}
