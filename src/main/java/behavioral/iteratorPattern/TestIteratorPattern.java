package behavioral.iteratorPattern;

public class TestIteratorPattern {

    public static void main(String[] args){
        ChannelCollection channels = populateChannels();
        ChannelIterator baseIterator = channels.iterator(ChannelTypeEnum.ENGLISH);
        while (baseIterator.hasNext()){
            Channel c = baseIterator.next();
            System.out.println(c);
        }
    }

    private static ChannelCollection populateChannels(){
        ChannelCollection channels = new ChannelCollectionImpl();
        channels.addChannel(new Channel(98.5,ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(100,ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(112,ChannelTypeEnum.ENGLISH));
        return channels;
    }
}
