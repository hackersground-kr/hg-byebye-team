import { useState } from "react";
import styled from "styled-components";

const Background = styled.div`
    width: 90vw;
    height: 90vh;
    padding: 5vh 5vw;
    background-color: #e4e3e3;
`;

const Card = styled.div`
    width: 100%;
    height: 15%;
    background-color: white;
    margin-top: 15px;
    border-radius: 10px;
    display: flex;
    justify-content: flex-start;
    line-height: 15%;
`;

const CompanyPage = () => {
    const [itemList, setItemList] = useState([
        {
            "name": "네이버",
            "description": "말이 필요없는 레전드 기업"
        },
        {
            "name": "네이버",
            "description": "말이 필요없는 레전드 기업"
        },
        {
            "name": "네이버",
            "description": "말이 필요없는 레전드 기업"
        },
        {
            "name": "네이버",
            "description": "말이 필요없는 레전드 기업"
        }
    ])

    return (
        <Background>
            <h1>Chapter2에서 태어난 기업</h1>

            <div style={{width: "100%", height: "100%"}}>
                {itemList.map((item, index) => {
                    return (
                        <Card>
                            <div style={{width: "10%", height: "80%"}}>
                                <img src="/companylogo.png" style={{width: "100%", height: "100%"}}/>
                            </div>
                            <div style={{marginLeft: "3vw"}}>
                                <p style={{fontFamily: "Preteandard-Regular", fontSize: "25px", fontWeight: "bolder"}}>{item.name}</p>
                                <p>{item.description}</p>
                            </div>
                        </Card>
                    )
                })}
            </div>
        </Background>
    )
}

export default CompanyPage;