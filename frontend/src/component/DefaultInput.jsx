import styled from "styled-components"

const DefaultInputStyle = styled.input`
    border-bottom: 1;
    border-top: none;
    border-left: none;
    border-right: none;
    &:focus {
        outline: none;
    }

    width: 80vw;
    height: 35px;
`;

const DefaultInput = (props) => {
    return (
        <DefaultInputStyle placeholder={props.placeholder}>

        </DefaultInputStyle>
    )
}

export default DefaultInput;