import styled from "styled-components";

const DefaultButtonStyle = styled.button`
    width: 80vw;
    height: 45px;
    background-color: ${(props) => props.color? props.color: "rgb(4, 4, 4)"};
    border-radius: 5px;
    color: white;
`;
  
const InnerButtonText = styled.span`
    font-family: 'Pretendard-Regular';
`

const DefualtButton = (props) => {
    console.log(props.color === undefined)
    return (
        <DefaultButtonStyle onClick={props.click} color={props.color}>
            <InnerButtonText>{props.text}</InnerButtonText>
        </DefaultButtonStyle>
    );
}

export default DefualtButton;