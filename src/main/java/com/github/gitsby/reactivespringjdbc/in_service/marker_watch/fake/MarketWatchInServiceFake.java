package com.github.gitsby.reactivespringjdbc.in_service.marker_watch.fake;


import com.github.gitsby.reactivespringjdbc.in_service.marker_watch.MarketWatchInService;
import com.github.gitsby.reactivespringjdbc.in_service.model.Response;

public class MarketWatchInServiceFake implements MarketWatchInService {

  @Override
  public Response<String> getMainTable() {

    Response<String> response = new Response<>();
    response.body = "[{\"icp\": 0.0, \"iop\": 0.0, \"open\": 0.0, \"state\": \"Active\", \"value\": 0.0, \"bidQty\": 0.0, \"volume\": 0.0, \"secCode\": \"ARF.0124\", \"bidPrice\": 0.0, \"currency\": \"KZT\", \"lowPrice\": 0.0, \"offerQty\": 0.0, \"highPrice\": 0.0, \"lastTrade\": 0.0, \"shortName\": null, \"assetClass\": \"DEBT\", \"offerPrice\": 0.0, \"priceChange\": 0.0, \"percentChange\": 0.0, \"previousClose\": 0.0, \"numberOfTrades\": 0}, {\"icp\": 0.0, \"iop\": 0.0, \"open\": 0.0, \"state\": \"Active\", \"value\": 0.0, \"bidQty\": 0.0, \"volume\": 0.0, \"secCode\": \"KTCB2.1024\", \"bidPrice\": 0.0, \"currency\": \"KZT\", \"lowPrice\": 0.0, \"offerQty\": 0.0, \"highPrice\": 0.0, \"lastTrade\": 0.0, \"shortName\": null, \"assetClass\": \"DEBT\", \"offerPrice\": 0.0, \"priceChange\": 0.0, \"percentChange\": 0.0, \"previousClose\": 0.0, \"numberOfTrades\": 0}, {\"icp\": 0.0, \"iop\": 0.0, \"open\": 0.0, \"state\": \"Active\", \"value\": 0.0, \"bidQty\": 0.0, \"volume\": 0.0, \"secCode\": \"HCSBK.1233\", \"bidPrice\": 0.0, \"currency\": \"KZT\", \"lowPrice\": 0.0, \"offerQty\": 0.0, \"highPrice\": 0.0, \"lastTrade\": 0.0, \"shortName\": null, \"assetClass\": \"DEBT\", \"offerPrice\": 0.0, \"priceChange\": 0.0, \"percentChange\": 0.0, \"previousClose\": 0.0, \"numberOfTrades\": 0}, {\"icp\": 0.0, \"iop\": 0.0, \"open\": 0.0, \"state\": \"Active\", \"value\": 0.0, \"bidQty\": 200.0, \"volume\": 0.0, \"secCode\": \"KAP\", \"bidPrice\": 5165.0, \"currency\": \"KZT\", \"lowPrice\": 0.0, \"offerQty\": 2.0, \"highPrice\": 0.0, \"lastTrade\": 0.0, \"shortName\": null, \"assetClass\": \"EQTY\", \"offerPrice\": 5220.0, \"priceChange\": 0.0, \"percentChange\": 0.0, \"previousClose\": 5200.0, \"numberOfTrades\": 0}, {\"icp\": 0.0, \"iop\": 0.0, \"open\": 0.0, \"state\": \"Active\", \"value\": 0.0, \"bidQty\": 15.0, \"volume\": 0.0, \"secCode\": \"KAP.Y\", \"bidPrice\": 13.0, \"currency\": \"USD\", \"lowPrice\": 0.0, \"offerQty\": 8493.0, \"highPrice\": 0.0, \"lastTrade\": 0.0, \"shortName\": null, \"assetClass\": \"EQTY\", \"offerPrice\": 14.0, \"priceChange\": 0.0, \"percentChange\": 0.0, \"previousClose\": 14.0, \"numberOfTrades\": 0}, {\"icp\": 0.0, \"iop\": 0.0, \"open\": 0.0, \"state\": \"Active\", \"value\": 0.0, \"bidQty\": 0.0, \"volume\": 0.0, \"secCode\": \"REFSK.0619\", \"bidPrice\": 0.0, \"currency\": \"KZT\", \"lowPrice\": 0.0, \"offerQty\": 0.0, \"highPrice\": 0.0, \"lastTrade\": 0.0, \"shortName\": null, \"assetClass\": \"DEBT\", \"offerPrice\": 0.0, \"priceChange\": 0.0, \"percentChange\": 0.0, \"previousClose\": 0.0, \"numberOfTrades\": 0}, {\"icp\": 0.0, \"iop\": 0.0, \"open\": 0.0, \"state\": \"Active\", \"value\": 0.0, \"bidQty\": 0.0, \"volume\": 0.0, \"secCode\": \"KTZ.1223\", \"bidPrice\": 0.0, \"currency\": \"CHF\", \"lowPrice\": 0.0, \"offerQty\": 0.0, \"highPrice\": 0.0, \"lastTrade\": 0.0, \"shortName\": null, \"assetClass\": \"DEBT\", \"offerPrice\": 0.0, \"priceChange\": 0.0, \"percentChange\": 0.0, \"previousClose\": 0.0, \"numberOfTrades\": 0}, {\"icp\": 0.0, \"iop\": 0.0, \"open\": 0.0, \"state\": \"Active\", \"value\": 0.0, \"bidQty\": 0.0, \"volume\": 0.0, \"secCode\": \"MFKZ.1123\", \"bidPrice\": 0.0, \"currency\": \"EUR\", \"lowPrice\": 0.0, \"offerQty\": 0.0, \"highPrice\": 0.0, \"lastTrade\": 0.0, \"shortName\": null, \"assetClass\": \"DEBT\", \"offerPrice\": 0.0, \"priceChange\": 0.0, \"percentChange\": 0.0, \"previousClose\": 0.0, \"numberOfTrades\": 0}, {\"icp\": 0.0, \"iop\": 0.0, \"open\": 0.0, \"state\": \"Active\", \"value\": 0.0, \"bidQty\": 0.0, \"volume\": 0.0, \"secCode\": \"MFKZ.1128\", \"bidPrice\": 0.0, \"currency\": \"EUR\", \"lowPrice\": 0.0, \"offerQty\": 0.0, \"highPrice\": 0.0, \"lastTrade\": 0.0, \"shortName\": null, \"assetClass\": \"DEBT\", \"offerPrice\": 0.0, \"priceChange\": 0.0, \"percentChange\": 0.0, \"previousClose\": 0.0, \"numberOfTrades\": 0}, {\"icp\": 0.0, \"iop\": 0.0, \"open\": 0.0, \"state\": \"Active\", \"value\": 0.0, \"bidQty\": 0.0, \"volume\": 0.0, \"secCode\": \"KMC.1233\", \"bidPrice\": 0.0, \"currency\": \"KZT\", \"lowPrice\": 0.0, \"offerQty\": 0.0, \"highPrice\": 0.0, \"lastTrade\": 0.0, \"shortName\": null, \"assetClass\": \"DEBT\", \"offerPrice\": 0.0, \"priceChange\": 0.0, \"percentChange\": 0.0, \"previousClose\": 0.0, \"numberOfTrades\": 0}, {\"icp\": 0.0, \"iop\": 0.0, \"open\": 0.0, \"state\": \"Active\", \"value\": 0.0, \"bidQty\": 0.0, \"volume\": 0.0, \"secCode\": \"KTCB.1024\", \"bidPrice\": 0.0, \"currency\": \"KZT\", \"lowPrice\": 0.0, \"offerQty\": 0.0, \"highPrice\": 0.0, \"lastTrade\": 0.0, \"shortName\": null, \"assetClass\": \"DEBT\", \"offerPrice\": 0.0, \"priceChange\": 0.0, \"percentChange\": 0.0, \"previousClose\": 0.0, \"numberOfTrades\": 0}]";
    response.url = "http://fake.org/api/table/main-records22";
    response.isOk = true;
    return response;
  }

}
