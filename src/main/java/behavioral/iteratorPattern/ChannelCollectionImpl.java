package behavioral.iteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection{

    private List<Channel> channelList;

    public ChannelCollectionImpl(){
        channelList = new ArrayList<>();
    }

    public void addChannel(Channel c){
        this.channelList.add(c);
    }

    public void removeChannel(Channel c){
        this.channelList.remove(c);
    }

    @Override
    public ChannelIterator iterator(ChannelTypeEnum type){
        return new ChannelIteratorImpl(type,this.channelList);
    }


}
